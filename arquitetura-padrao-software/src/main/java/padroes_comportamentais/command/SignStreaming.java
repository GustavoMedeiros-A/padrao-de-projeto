package padroes_comportamentais.command;

public class SignStreaming implements Subscription {

    private Streaming stream;
    private String status;

    public SignStreaming(Streaming stream, String status) {
        this.stream = stream;
        this.status = status;
    }

    public void sign() {
        this.stream.signStreaming();
    }

    public void cancel() {
        this.stream.cancelStreaming();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void logs(String status) {
        if (status == "Sign") {
            this.setStatus(status);
            System.out.println("is sign" + this.getStatus());
        } else {
            this.setStatus(status);
            System.out.println("is sign" + this.getStatus());

        }
    }
}
