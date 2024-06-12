package padroes_comportamentais.command;

public class Streaming {

    public String name;
    public int price;
    public String status;

    public Streaming(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void signStreaming() {
        this.status = "Sign Streaming";
    }

    public void cancelStreaming() {
        this.status = "Cancel Streaming";
    }
}
