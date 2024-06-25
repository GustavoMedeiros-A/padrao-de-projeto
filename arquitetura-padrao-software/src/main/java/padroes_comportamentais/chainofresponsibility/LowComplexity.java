package padroes_comportamentais.chainofresponsibility;

public class LowComplexity implements TicketComplexity {
    private static final LowComplexity lowComplexity = new LowComplexity();

    private LowComplexity() {
    };

    public static LowComplexity getComplexity() {
        return lowComplexity;
    }
}
