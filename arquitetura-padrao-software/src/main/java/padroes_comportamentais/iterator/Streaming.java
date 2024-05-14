package padroes_comportamentais.iterator;

import java.util.Iterator;

public class Streaming {

    public static Integer countHorrorCategoryMovie(Movie movie) {
        int quantity = 0;
        for (Category category : movie) {
            if (category.isHorror()) {
                quantity++;
            }
        }
        return quantity;
    }

    public static Integer countCategoryMovie(Movie movie) {
        int quantity = 0;
        for (Iterator<Category> c = movie.iterator(); c.hasNext();) {
            quantity++;
            c.next();
        }
        return quantity;
    }
}