package padroes_comportamentais.interpreter;

import padroes_comportamentais.interpreter.expression.InterpreterExpression;
import padroes_comportamentais.interpreter.expression.InterpreterExpressionArithmetic;

public class Product {
    public int price;
    public String name;
    public int quantity;

    public Product(int price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public static String formula = "price * quantity - 1 / 2";

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static double calcProductWithDiscount(double price, double quantity) {
        String expression;
        Boolean isDiscount = true;
        expression = formula.replace("price", Double.toString(price));
        expression = expression.replace("quantity", Double.toString(quantity));
        InterpreterExpression interpreter = new InterpreterExpressionArithmetic(expression, isDiscount);
        return interpreter.interpreter();
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "'\n, price=" + price + ", quantity=" + quantity + "}";
    }

}
