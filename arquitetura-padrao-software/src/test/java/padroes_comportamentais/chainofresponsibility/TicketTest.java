package padroes_comportamentais.chainofresponsibility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TicketTest {

    Support junior;
    Support senior;
    Support expert;

    @BeforeEach
    public void setUp() {
        expert = new ExpertSupport(null);
        senior = new SeniorSupport(expert);
        junior = new JuniorSupport(senior);
    }

    @Test
    public void juniorShouldHandleLowComplexityTicket() {
        Ticket lowComplexityTicket = new Ticket(LowComplexity.getComplexity());
        junior.getSuperior();
        assertEquals("Junior Support", junior.handleTicket(lowComplexityTicket));
    }

    @Test
    void seniorShouldHandleMediumComplexityTicket() {
        Ticket mediumComplexityTicket = new Ticket(MediumComplexity.getComplexity());
        assertEquals("Senior Support",
                junior.handleTicket(mediumComplexityTicket));
    }

    @Test
    public void expertShouldHandleHighComplexityTicket() {
        Ticket highComplexityTicket = new Ticket(HighComplexity.getComplexity());
        assertEquals("Expert Support", junior.handleTicket(highComplexityTicket));
    }

    @Test
    public void expertShouldHandleLowComplexityTicket() {
        Ticket lowComplexityTicket = new Ticket(LowComplexity.getComplexity());
        assertEquals("Expert Support", expert.handleTicket(lowComplexityTicket));
    }

    @Test
    void expertShouldHandleMediumComplexityTicket() {
        Ticket mediumComplexityTicket = new Ticket(MediumComplexity.getComplexity());
        assertEquals("Expert Support",
                expert.handleTicket(mediumComplexityTicket));
    }

    @Test
    public void expertShouldHandleHighComplexityTicketDirectly() {
        Ticket highComplexityTicket = new Ticket(HighComplexity.getComplexity());
        assertEquals("Expert Support", expert.handleTicket(highComplexityTicket));
    }

    @Test
    public void noOneShouldHandleUnknownComplexityTicket() {
        Ticket unknownComplexityTicket = new Ticket(new TicketComplexity() {
        });
        assertEquals("No one can handle this ticket", junior.handleTicket(unknownComplexityTicket));
    }
}
