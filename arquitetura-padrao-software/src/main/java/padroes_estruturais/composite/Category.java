package padroes_estruturais.composite;

public abstract class Category {

    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getCategory();

}