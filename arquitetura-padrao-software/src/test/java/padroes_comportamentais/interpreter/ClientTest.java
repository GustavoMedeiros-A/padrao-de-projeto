package padroes_comportamentais.interpreter;

import org.junit.jupiter.api.Test;

import padroes_comportamentais.interpreter.expression.InterpreterExpressionArithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ClientTest {
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
    void shouldCalculateExpressionWithFormulaAndMoreThanOneProduct() {
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
    void shouldHandleNullProductList() {
        var client = new Client("mario", null);
        var discounts = client.calcProductWithDiscount();
        assertEquals(new ArrayList<>(), discounts);
    }

    @Test
    void shouldHandleEmptyProductList() {
        var client = new Client("mario", new ArrayList<>());
        var discounts = client.calcProductWithDiscount();
        assertEquals(new ArrayList<>(), discounts);
    }

    @Test
    void shouldHandleNullProductsInList() {
        ArrayList<Double> assertResults = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        var soda = new Soda(3, "guarana", 4);
        products.add(soda);
        products.add(null);

        var client = new Client("mario", products);
        var discounts = client.calcProductWithDiscount();
        assertResults.add(5.5);
        assertEquals(assertResults, discounts);
    }

    @Test
    void shouldCalculateTotalValueOfProductList() {
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

    @Test
    void testClientToString() {
        var soda = new Soda(3, "guarana", 4);
        var popcorn = new Popcorn(10, "popcorn", 1);

        var products = new ArrayList<Product>();
        products.add(soda);
        products.add(popcorn);

        var client = new Client("mario", products);
        String expected = "Client{name='mario'\n, Products=[Product{name='guarana'\n, price=3, quantity=4}, Product{name='popcorn'\n, price=10, quantity=1}]}";
        assertEquals(expected, client.toString());
    }

    @Test
    void testClientToStringWithNullProducts() {
        var soda = new Soda(3, "guarana", 4);
        var popcorn = new Popcorn(10, "popcorn", 1);

        var products = new ArrayList<Product>();
        products.add(soda);
        products.add(null);
        products.add(popcorn);

        var client = new Client("mario", products);
        String expected = "Client{name='mario'\n, Products=[Product{name='guarana'\n, price=3, quantity=4}, null, Product{name='popcorn'\n, price=10, quantity=1}]}";
        assertEquals(expected, client.toString());
    }

}
