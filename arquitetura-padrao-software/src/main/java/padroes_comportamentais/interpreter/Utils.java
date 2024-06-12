package padroes_comportamentais.interpreter;

import java.util.ArrayList;

public final class Utils {
    public String converterExpression(ArrayList<Product> products) {
        StringBuilder expression = new StringBuilder();
        boolean firstProduct = true;

        for (Product product : products) {
            if (!firstProduct) {
                expression.append(" + ");
            } else {
                firstProduct = false;
            }
            expression.append(product.getQuantity()).append(" * ").append(product.getPrice());
        }
        return expression.toString();
    }
}
