package padroes_comportamentais.interpreter.expression;

public class Sum implements InterpreterExpression {

    private double x;
    private double y;

    public Sum(Number leftElement, Number rightElement) {
        x = leftElement.getNumber();
        y = rightElement.getNumber();
    }

    public double interpreter() {
        return x + y;
    }
}
