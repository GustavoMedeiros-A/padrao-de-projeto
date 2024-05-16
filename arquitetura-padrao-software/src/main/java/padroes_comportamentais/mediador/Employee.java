package padroes_comportamentais.mediador;

public class Employee implements Company {

    private static Employee instance = new Employee();

    private Employee() {
    }

    public static Employee getInstance() {
        return instance;
    }

    @Override
    public String receiveCompliment(String message) {
        return "The employee thanks  " + message;
    }

    @Override
    public String receiveComplain(String message) {
        return "The employee will improve you work" + message;
    }

    @Override
    public String receiveRequest(String message) {
        return "The employee will make the request " + message;
    }

}