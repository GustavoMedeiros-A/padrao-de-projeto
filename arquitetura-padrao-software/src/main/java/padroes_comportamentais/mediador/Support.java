package padroes_comportamentais.mediador;

public class Support {
    private static Support instance = new Support();

    private Support() {
    }

    public static Support getInstance() {
        return instance;
    }

    public String receiveComplimentEmployee(String message) {
        return "Support thanks for the message. The employee's thanks. Client message is "
                + Employee.getInstance().receiveCompliment(message);
    }

    public String receiveComplianEmployee(String message) {
        return "Support thanks for the message. The employee's will improve The employee will improve. Client message is "
                + Employee.getInstance().receiveComplain(message);
    }

    public String receiveRequestEmployee(String message) {
        return "Support thanks for the message. The employee's will make this. Client message is "
                + Employee.getInstance().receiveRequest(message);
    }
}
