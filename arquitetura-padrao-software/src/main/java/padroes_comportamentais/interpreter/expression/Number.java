package padroes_comportamentais.interpreter.expression;

public class Number implements InterpreterExpression {

    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double interpreter() {
        return number;
    }

    public double getNumber() {
        return this.number;
    }

}