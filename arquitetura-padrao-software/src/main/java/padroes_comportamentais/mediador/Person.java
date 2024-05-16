package padroes_comportamentais.mediador;

public class Person {

    public String compliment(String message) {
        return Support.getInstance().receiveComplimentEmployee(message);
    }

    public String complian(String message) {
        return Support.getInstance().receiveComplianEmployee(message);
    }

    public String request(String message) {
        return Support.getInstance().receiveRequestEmployee(message);
    }

}
