package padroes_estruturais.adapter;

public class CategoryAdapter extends CategoryDuration {

    private ICategory categoryDescription;

    public CategoryAdapter(ICategory categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String catchDescription() {
        if (this.getDuration() >= 120.0f)
            categoryDescription.setCategory("Filme longo");
        else if (this.getDuration() >= 90.0f)
            categoryDescription.setCategory("Filme médio");
        else if (this.getDuration() >= 60.0f)
            categoryDescription.setCategory("Filme ok");
        else
            categoryDescription.setCategory("Filme curto");
        return categoryDescription.getCategory();
    }

    public void saveDuration() {
        if (categoryDescription.getCategory().equals("Filme longo"))
            this.setDuration(120.0f);
        else if (categoryDescription.getCategory().equals("Filme médio"))
            this.setDuration(90.0f);
        else if (categoryDescription.getCategory().equals("Filme ok"))
            this.setDuration(60.0f);
        else
            this.setDuration(30.0f);
    }
}
