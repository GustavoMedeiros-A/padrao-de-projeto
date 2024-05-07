package padroes_comportamentais.interpreter;

public class Product {
    private Double price;
    private String name;
    private int quantity;

    public Product(Double price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "'\n, price=" + price + ", quantity=" + quantity + "}";
    }

}
