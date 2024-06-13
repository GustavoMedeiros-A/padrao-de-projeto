package padroes_comportamentais.state;

public class AvailableState extends BookState {
    private static AvailableState instance = new AvailableState();

    private AvailableState() {
    }

    public static AvailableState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Available";
    }

    @Override
    public boolean reserve(Book book) {
        book.setState(ReservedState.getInstance());
        return true;
    }

    @Override
    public boolean lostBook(Book book) {
        book.setState(LoseState.getInstance());
        return true;
    }

}
