package padroes_estruturais.bridge;

public class Producer extends Movie {

    public Producer(float baseSalary) {
        super(baseSalary);
    }

    public float calcSalary() {
        return this.baseSalary;
    }
}
