package padroes_comportamentais.interpreter.expression;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpreterExpressionArithmetic implements InterpreterExpression {

    private InterpreterExpression initialInterpreter;

    public InterpreterExpressionArithmetic(String context) {

        Stack<InterpreterExpression> stackInterpreter = new Stack<>();
        List<String> elements = Arrays.asList(context.split(" "));
        Iterator<String> iterator = elements.iterator();

        while (iterator.hasNext())
            ;
        {
            String element = iterator.next();
            if (element.matches("\\d+(\\.\\d*)?")) {
                stackInterpreter.push(new Number(Double.parseDouble(element)));
            } else if (element.equals("+")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Expressão inválida");
                }
                Number leftElement = (Number) stackInterpreter.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Sum interpreter = new Sum(leftElement, rightElement);
                stackInterpreter.push(new Number(interpreter.interpreter()));
            }
        }
        initialInterpreter = stackInterpreter.pop();
    }

    public double interpreter() {
        return initialInterpreter.interpreter();
    }
}
