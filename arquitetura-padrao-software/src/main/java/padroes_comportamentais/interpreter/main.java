package padroes_comportamentais.interpreter;

import java.util.ArrayList;

public class main {
    public static void main(String args[]) {
        var popcorn = new Popcorn(7, "popcorn", 2);
        var soda = new Soda(3, "coca", 2);
        var products = new ArrayList<Product>();
        products.add(popcorn);
        products.add(soda);
        var utils = new Utils();
        var client = new Client("daris", products);
        var productConverter = utils.converterExpression(products);

        System.out.println(client.toString());
        System.out.println("\n" + productConverter);
        return;
    }

}