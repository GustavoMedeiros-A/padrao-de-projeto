package padroes_comportamentais.interpreter;

import org.junit.jupiter.api.Test;

import padroes_comportamentais.interpreter.expression.InterpreterExpressionArithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ClientTest {
    // public static String formula = "price * quantity - 1 / 2";
    @Test
    void shouldCalculateExpressionWithFormulaAndOneProduct() {
        ArrayList<Double> assertResults = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        var soda = new Soda(3, "guarana", 4);
        products.add(soda);

        var client = new Client("mario", products);
        var discounts = client.calcProductWithDiscount();
        assertResults.add(5.5);
        assertEquals(assertResults, discounts);

    }

    @Test
    void shouldCalculateExpressionWithFormulaAndMoreThatOneProduct() {
        ArrayList<Double> assertResults = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        var soda = new Soda(3, "guarana", 4);
        var popcorn = new Popcorn(10, "popcorn", 1);

        products.add(soda);
        products.add(popcorn);

        var client = new Client("mario", products);
        var discounts = client.calcProductWithDiscount();
        assertResults.add(5.5);
        assertResults.add(4.5);
        assertEquals(assertResults, discounts);

    }

    @Test
    void shoundCalculateTheFinalValueOfProductList() {
        var popcorn = new Popcorn(7, "popcorn", 2);
        var soda = new Soda(3, "coca", 2);
        var soda2 = new Soda(3, "guarana", 4);
        var products = new ArrayList<Product>();
        products.add(popcorn);
        products.add(soda);
        products.add(soda2);
        var utils = new Utils();
        var productConverter = utils.converterExpression(products);
        var interpreter = new InterpreterExpressionArithmetic(productConverter, false);
        assertEquals(32.0, interpreter.interpreter());
    }

}
