package padroes_estruturais.bridge;

public class Director extends Movie {

    public Director(float baseSalary) {
        super(baseSalary);
    }

    public float calcSalary() {
        return this.baseSalary * (1 + this.category.increaseSalary());
    }

}
