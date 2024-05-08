package padroes_comportamentais.interpreter;

import java.util.ArrayList;

import padroes_comportamentais.interpreter.expression.InterpreterExpressionArithmetic;

public class main {
    public static void main(String args[]) {
        var popcorn = new Popcorn(7, "popcorn", 2);
        var soda = new Soda(3, "coca", 2);
        var soda2 = new Soda(3, "guarana", 4);
        var products = new ArrayList<Product>();
        products.add(popcorn);
        products.add(soda);
        products.add(soda2);
        var utils = new Utils();
        var client = new Client("daris", products);
        var productConverter = utils.converterExpression(products);

        System.out.println(client.toString());
        System.out.println("\n" + productConverter);

        var interpreter = new InterpreterExpressionArithmetic(productConverter,
                false);
        System.out.println(interpreter.interpreter());

        var interpreter2 = new InterpreterExpressionArithmetic("6 - 2", false);
        System.out.println(interpreter2.interpreter());
        return;
    }

}