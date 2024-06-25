package padroes_comportamentais.iterator;

public class Category {

    private String name;
    private boolean isHorror;

    public Category(String name, boolean isHorror) {
        this.name = name;
        this.isHorror = isHorror;
    }

    public boolean isHorror() {
        return isHorror;
    }

}
