package padroes_comportamentais.chainofresponsibility;

public class JuniorSupport extends Support {
    public JuniorSupport(Support superior) {
        listTickets.add(LowComplexity.getComplexity());
        setSuperior(superior);
    }

    @Override
    public String getDescription() {
        return "Junior Support";
    }
}
