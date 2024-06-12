package padroes_comportamentais.mediador;

public interface Company {

    String receiveCompliment(String message);

    String receiveComplain(String message);

    String receiveRequest(String message);
}
