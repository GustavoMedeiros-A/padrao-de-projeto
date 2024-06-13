package padroes_comportamentais.state;

public class ReservedState extends BookState {

    private static ReservedState instance = new ReservedState();

    private ReservedState() {
    };

    @Override
    public String getState() {
        return "Reserved";
    }

    public static ReservedState getInstance() {
        return instance;
    }

    @Override
    public boolean returnBook(Book book) {
        book.setState(AvailableState.getInstance());
        return true;
    }

    @Override
    public boolean lostBook(Book book) {
        book.setState(LoseState.getInstance());
        return true;
    }

}
