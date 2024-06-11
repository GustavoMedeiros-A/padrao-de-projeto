package padroes_comportamentais.strategy;

public class Movie {

    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculationPriceWithDiscount(double price) {
        if (discountStrategy != null) {
            return discountStrategy.applyDiscount(price);
        }

        return price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
