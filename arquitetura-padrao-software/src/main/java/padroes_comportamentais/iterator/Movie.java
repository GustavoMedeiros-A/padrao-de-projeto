package padroes_comportamentais.iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Movie implements Iterable<Category> {

    private List<Category> categories = new ArrayList<Category>();

    public Movie(Category... categories) {
        this.categories = Arrays.asList(categories);
    }

    @Override
    public Iterator<Category> iterator() {
        return categories.iterator();
    }
}
