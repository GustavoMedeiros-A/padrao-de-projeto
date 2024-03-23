package padroes_estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Award extends Category {

    private List<Category> categories;

    public Award(String nome) {
        super(nome);
        this.categories = new ArrayList<Category>();
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public String getCategory() {
        String out = "";
        out = "Award: " + this.getName() + "\n";
        for (Category category : categories) {
            out += category.getCategory();
        }
        return out;
    }

}
