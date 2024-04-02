package padroes_estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightCategoryFactory {

    private static Map<String, Category> categories = new HashMap<>();

    public static Category getCategory(String name, String description) {
        var category = categories.get(name);
        if (category == null) {
            category = categories.put(name, new Category(name, description));
        }
        return category;
    }

    public static int categorySize() {
        return categories.size();
    }

}
