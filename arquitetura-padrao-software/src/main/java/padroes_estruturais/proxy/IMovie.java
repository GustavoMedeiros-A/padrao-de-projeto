package padroes_estruturais.proxy;

import java.util.List;

public interface IMovie {

    List<String> getInformation();

    List<String> watchMovie(User user);
}
