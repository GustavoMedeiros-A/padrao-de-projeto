package padroes_comportamentais.interpreter;

import java.util.ArrayList;

public class main {
    public static void main(String args[]) {
        var popcorn = new Popcorn(7.0, "popcorn", 2);
        var soda = new Soda(3.0, "coca", 2);
        var products = new ArrayList<Product>();
        products.add(popcorn);
        products.add(soda);

        var client = new Client("daris", products);

        System.out.println(client.toString());
        return;
    }

}