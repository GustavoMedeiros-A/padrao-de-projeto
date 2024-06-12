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

    public ArrayList<Double> calcProductWithDiscount() {
        ArrayList<Double> discounts = new ArrayList<>();
        if (products == null || products.isEmpty()) {
            return discounts;
        }
        for (Product product : products) {
            if (product != null) {
                double discount = Product.calcProductWithDiscount(product.getPrice(), product.getQuantity());
                discounts.add(discount);
            }
        }
        return discounts;
    }

    @Override
    public String toString() {
        List<String> productDescriptions = products.stream()
                .map(product -> product == null ? "null" : product.toString())
                .collect(Collectors.toList());
        return "Client{name='" + name + "'\n, Products=[" + String.join(", ", productDescriptions) + "]}";
    }

}
