package padroes_estruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    @Test
    void shouldCalculateActorSalary() {
        Actor actor = new Actor(100);
        actor.setHoursRecorded(10);
        actor.setCategory(new Kids());

        float expectedSalary = 100 * 10 * 1.2f; // baseSalary * hoursRecorded * (1 + increaseSalary)
        assertEquals(expectedSalary, actor.calcSalary());
    }

    @Test
    void shouldCalculateDirectorSalary() {
        Director director = new Director(1000);
        director.setCategory(new Kids());

        float expectedSalary = 1000 * 1.2f; // baseSalary * (1 + increaseSalary)
        assertEquals(expectedSalary, director.calcSalary());
    }

    @Test
    void shouldCalculateProducerSalaryWithoutCategoryIncrease() {
        Producer producer = new Producer(1500);

        float expectedSalary = 1500; // baseSalary only
        assertEquals(expectedSalary, producer.calcSalary());
    }

    @Test
    void shouldCalculateProducerSalaryWithCategoryIncrease() {
        Producer producer = new Producer(1500);
        producer.setCategory(new Kids());

        float expectedSalary = 1500;
        assertEquals(expectedSalary, producer.calcSalary());
    }

    @Test
    void shouldCalculateActorSalaryWithActionCategory() {
        Actor actor = new Actor(100);
        actor.setHoursRecorded(10);
        actor.setCategory(new Action());

        float expectedSalary = 100 * 10 * 1.7f; // baseSalary * hoursRecorded * (1 + increaseSalary)
        assertEquals(expectedSalary, actor.calcSalary());
    }

    @Test
    void shouldCalculateDirectorSalaryWithActionCategory() {
        Director director = new Director(1000);
        director.setCategory(new Action());

        float expectedSalary = 1000 * 1.7f; // baseSalary * (1 + increaseSalary)
        assertEquals(expectedSalary, director.calcSalary());
    }

    @Test
    void shouldCalculateProducerSalaryWithActionCategory() {
        Producer producer = new Producer(1500);
        producer.setCategory(new Action());

        float expectedSalary = 1500; // baseSalary * (1 + increaseSalary)
        assertEquals(expectedSalary, producer.calcSalary());
    }

    @Test
    void shouldCalculateActorSalaryWithHorrorCategory() {
        Actor actor = new Actor(100);
        actor.setHoursRecorded(10);
        actor.setCategory(new Horror());

        float expectedSalary = 100 * 10 * 2.5f; // baseSalary * hoursRecorded * (1 + increaseSalary)
        assertEquals(expectedSalary, actor.calcSalary());
    }

    @Test
    void shouldCalculateDirectorSalaryWithHorrorCategory() {
        Director director = new Director(1000);
        director.setCategory(new Horror());

        float expectedSalary = 1000 * 2.5f; // baseSalary * (1 + increaseSalary)
        assertEquals(expectedSalary, director.calcSalary());
    }

    @Test
    void shouldCalculateProducerSalaryWithHorrorCategory() {
        Producer producer = new Producer(1500);
        producer.setCategory(new Horror());

        float expectedSalary = 1500; // baseSalary * (1 + increaseSalary)
        assertEquals(expectedSalary, producer.calcSalary());
    }
}
