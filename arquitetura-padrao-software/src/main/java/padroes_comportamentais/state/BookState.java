package padroes_comportamentais.state;

public abstract class BookState {

    public abstract String getState();

    public boolean reserve(Book book) {
        return false;
    }

    public boolean returnBook(Book book) {
        return false;
    }

    public boolean lostBook(Book book) {
        return false;
    }
}
