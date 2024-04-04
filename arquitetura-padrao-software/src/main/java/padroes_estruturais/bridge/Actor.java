package padroes_estruturais.bridge;

public class Actor extends Movie {

    private int hoursRecorded;

    public Actor(float baseSalary) {
        super(baseSalary);
    }

    public void setHoursRecorded(int hoursRecorded) {
        this.hoursRecorded = hoursRecorded;
    }

    public float calcSalary() {
        return this.baseSalary * this.hoursRecorded * (1 + this.category.increaseSalary());
    }
}
