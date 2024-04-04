package padroes_estruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    @Test
    void shouldReturnActorOfKidsMovies() {
        ICategory ICategory = new Kids();
        Actor actor = new Actor(1000);
        actor.setCategory(ICategory);
        actor.setHoursRecorded(2);
        assertEquals(2400, actor.calcSalary(), 0.01f);
    }

    @Test
    void shouldReturnActorOfActionMovie() {
        ICategory ICategory = new Action();
        Actor actor = new Actor(1000);
        actor.setCategory(ICategory);
        actor.setHoursRecorded(2);
        assertEquals(3400, actor.calcSalary(), 0.01f);
    }

    @Test
    void shouldReturnActorOfHorrorMovie() {
        ICategory ICategory = new Horror();
        Actor actor = new Actor(1000);
        actor.setCategory(ICategory);
        actor.setHoursRecorded(2);
        assertEquals(5000, actor.calcSalary(), 0.01f);
    }
}
