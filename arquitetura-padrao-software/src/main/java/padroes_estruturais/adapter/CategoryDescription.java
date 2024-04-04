package padroes_estruturais.adapter;

public class CategoryDescription implements ICategory {

    private String description;

    @Override
    public String getCategory() {
        return this.description;
    }

    @Override
    public void setCategory(String description) {
        this.description = description;
    }
}
