package padroes_comportamentais.iterator;

public class Category {

    private String name;
    private boolean isHorror;

    public Category(String name, boolean isHorror) {
        this.name = name;
        this.isHorror = isHorror;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHorror() {
        return isHorror;
    }

    public void setIsHorror(boolean isHorror) {
        this.isHorror = isHorror;
    }

}
