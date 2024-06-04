package padroes_comportamentais.observer;

public class Movie implements Observer {

    private final String name;
    private String lastNotification;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public void update(String lastNotification) {
        this.lastNotification = lastNotification;
        System.out.println("Movie name " + this.name + " Notification updated: " + lastNotification);
        show();
    }

    public String show() {
        return "Movie name " + this.name + " Notification updated: " + lastNotification;
    }

}
