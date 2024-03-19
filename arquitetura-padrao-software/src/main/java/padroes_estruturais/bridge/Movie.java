package padroes_estruturais.bridge;

public abstract class Movie {
    protected ICategory category;

    protected float baseSalary;

    public Movie(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setCategory(ICategory category) {
        this.category = category;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract float calcSalary();

}
