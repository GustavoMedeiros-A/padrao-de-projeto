package padroes_criacao.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void shouldShowActionMovie() {
        AbstractFactory factory = new ActionFactory();
        User user = new User(factory);
        assertEquals("Action Movie", user.showMovie());
    }

    @Test
    void shouldShowActionCategory() {
        AbstractFactory factory = new ActionFactory();
        User user = new User(factory);
        assertEquals("Action Category", user.showCategory());
    }

    @Test
    void shouldShowComedyMovie() {
        AbstractFactory factory = new ComedyFactory();
        User user = new User(factory);
        assertEquals("Comedy Movie", user.showMovie());
    }

    @Test
    void shouldShowComedyCategory() {
        AbstractFactory factory = new ComedyFactory();
        User user = new User(factory);
        assertEquals("Comedy Category", user.showCategory());
    }
}
