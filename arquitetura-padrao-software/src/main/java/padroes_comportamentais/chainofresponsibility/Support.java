package padroes_comportamentais.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class Support {
    protected List<TicketComplexity> listTickets = new ArrayList<>();
    private Support superior;

    public Support getSuperior() {
        return superior;
    }

    public void setSuperior(Support superior) {
        this.superior = superior;
    }

    public abstract String getDescription();

    public String handleTicket(Ticket ticket) {
        if (listTickets.contains(ticket.getComplexity())) {
            return getDescription();
        } else {
            if (superior != null) {
                return superior.handleTicket(ticket);
            } else {
                return "No one can handle this ticket";
            }
        }
    }
}
