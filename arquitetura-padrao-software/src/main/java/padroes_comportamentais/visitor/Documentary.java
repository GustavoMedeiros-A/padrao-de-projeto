package padroes_comportamentais.visitor;

public class Documentary {
    private String name;
    private double duration;

    public Documentary(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public String accept(Visitor visitor) {
        return visitor.showDocumentary(this);
    }
}
