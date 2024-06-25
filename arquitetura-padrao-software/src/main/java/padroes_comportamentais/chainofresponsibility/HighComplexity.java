package padroes_comportamentais.chainofresponsibility;

public class HighComplexity implements TicketComplexity {
    private static final HighComplexity highComplexity = new HighComplexity();

    private HighComplexity() {
    };

    public static HighComplexity getComplexity() {
        return highComplexity;
    }
}
