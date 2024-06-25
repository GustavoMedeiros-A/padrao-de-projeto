package padroes_comportamentais.chainofresponsibility;

public class MediumComplexity implements TicketComplexity {
    private static final MediumComplexity mediumComplexity = new MediumComplexity();

    private MediumComplexity() {
    };

    public static MediumComplexity getComplexity() {
        return mediumComplexity;
    }
}
