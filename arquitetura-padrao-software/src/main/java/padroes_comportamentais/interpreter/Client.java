package padroes_comportamentais.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    private String name;
    private ArrayList<Product> products;

    public Client(String name, ArrayList<Product> products) {
        this.products = products;
        this.name = name;
    }

    @Override
    public String toString() {
        List<String> productDescriptions = products.stream()
                .map(Product::toString)
                .collect(Collectors.toList());
        return "Client{name='" + name + "'\n, Products=[" + String.join(", ", productDescriptions) + "]}";
    }

    // @Override
    // public String toString() {
    // return "Product{name='" + name + "', price=" + price + ", quantity=" +
    // quantity + "}";
    // }
}
