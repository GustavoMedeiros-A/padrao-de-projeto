package padroes_comportamentais.state;

public class Book {

    private String name;
    private BookState state;

    public Book(String name) {
        this.name = name;
        this.state = AvailableState.getInstance();
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public String getState() {
        return state.getState();
    }

    public boolean reserve() {
        return state.reserve(this);
    }

    public boolean returnBook() {
        return state.returnBook(this);
    }

    public boolean lostBook() {
        return state.lostBook(this);
    }
}
