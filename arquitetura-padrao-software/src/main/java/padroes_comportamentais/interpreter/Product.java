package padroes_comportamentais.interpreter;

public class Product {
    public int price;
    public String name;
    public int quantity;

    public Product(int price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public int getPrice() {
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
