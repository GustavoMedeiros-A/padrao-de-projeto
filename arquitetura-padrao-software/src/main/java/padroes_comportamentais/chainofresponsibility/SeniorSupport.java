package padroes_comportamentais.chainofresponsibility;

public class SeniorSupport extends Support {
    public SeniorSupport(Support superior) {
        listTickets.add(LowComplexity.getComplexity());
        listTickets.add(MediumComplexity.getComplexity());
        setSuperior(superior);
    }

    @Override
    public String getDescription() {
        return "Senior Support";
    }
}
