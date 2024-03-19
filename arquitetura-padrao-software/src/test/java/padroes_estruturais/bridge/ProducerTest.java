package padroes_estruturais.bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProducerTest {
    @Test
    void shouldReturnProducerOfKidsMovies() {
        ICategory ICategory = new Kids();
        Producer producer = new Producer(1000);
        producer.setCategory(ICategory);
        assertEquals(1000, producer.calcSalary(), 0.01f);
    }

    @Test
    void shouldReturnProducerOfActionMovie() {
        ICategory ICategory = new Action();
        Producer producer = new Producer(2000);
        producer.setCategory(ICategory);
        assertEquals(2000, producer.calcSalary(), 0.01f);
    }

    @Test
    void shouldReturnProducerOfHorrorMovie() {
        ICategory ICategory = new Horror();
        Producer producer = new Producer(3000);
        producer.setCategory(ICategory);
        assertEquals(3000, producer.calcSalary(), 0.01f);
    }
}
