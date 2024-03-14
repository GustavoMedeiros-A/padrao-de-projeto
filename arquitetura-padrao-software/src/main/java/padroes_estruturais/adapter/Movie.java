package padroes_estruturais.adapter;

public class Movie {
    ICategory category;
    CategoryAdapter persistence;

    public Movie() {
        category = new CategoryDescription();
        persistence = new CategoryAdapter(category);
    }

    public void setCategory(String description) {
        category.setCategory(description);
        persistence.saveDuration();
    }

    public String getCategory() {
        return persistence.catchDescription();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do
    // adaptador
    public float getDuration() {
        return persistence.getDuration();
    }
}