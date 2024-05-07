package padroes_comportamentais.interpreter;

public class Popcorn extends Product {
    private Double price;

    public Popcorn(Double price, String name, int quantity) {
        super(price, name, quantity);
    }

    public Double getPopcornPrice() {
        return price;
    }

}
