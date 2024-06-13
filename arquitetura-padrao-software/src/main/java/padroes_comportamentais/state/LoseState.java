package padroes_comportamentais.state;

public class LoseState extends BookState {
    private static LoseState instance = new LoseState();

    public LoseState() {
    }

    public static LoseState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Book lost";
    }

}
