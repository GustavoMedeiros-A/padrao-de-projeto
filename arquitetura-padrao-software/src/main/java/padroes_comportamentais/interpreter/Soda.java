package padroes_comportamentais.interpreter;

public class Soda extends Product {

    public Soda(Double price, String name, int quantity) {
        super(price, name, quantity);
    }

    public Double getSodaPrice() {
        return 7.0;
    }

}
