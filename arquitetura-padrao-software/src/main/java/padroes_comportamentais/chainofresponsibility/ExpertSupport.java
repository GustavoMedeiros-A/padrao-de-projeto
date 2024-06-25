package padroes_comportamentais.chainofresponsibility;

public class ExpertSupport extends Support {
    public ExpertSupport(Support superior) {
        listTickets.add(LowComplexity.getComplexity());
        listTickets.add(MediumComplexity.getComplexity());
        listTickets.add(HighComplexity.getComplexity());
        setSuperior(superior);
    }

    @Override
    public String getDescription() {
        return "Expert Support";
    }
}
