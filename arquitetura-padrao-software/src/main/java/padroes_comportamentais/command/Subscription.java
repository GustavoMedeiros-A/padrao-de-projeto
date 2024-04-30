package padroes_comportamentais.command;

public interface Subscription {

    void sign();

    void cancel();

    void logs(String status);

}
