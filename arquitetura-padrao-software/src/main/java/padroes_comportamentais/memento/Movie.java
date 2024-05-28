package padroes_comportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private MovieStatus status;
    private List<MovieStatus> memento = new ArrayList<MovieStatus>();

    public MovieStatus getStatus() {
        return this.status;
    }

    public void setStatus(MovieStatus status) {
        this.status = status;
        this.memento.add(status);
    }

    public void restoreStatus(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }

        this.status = this.memento.get(index);
    }

    public List<MovieStatus> getAllStatus() {
        return this.memento;
    }

}