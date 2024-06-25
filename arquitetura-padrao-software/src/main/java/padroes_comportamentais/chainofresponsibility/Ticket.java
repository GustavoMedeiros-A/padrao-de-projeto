package padroes_comportamentais.chainofresponsibility;

public class Ticket {
    private TicketComplexity complexity;

    public Ticket(TicketComplexity complexity) {
        this.complexity = complexity;
    }

    public TicketComplexity getComplexity() {
        return complexity;
    }
}
