package padroes_comportamentais.interpreter.expression;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpreterExpressionArithmetic implements InterpreterExpression {

    private InterpreterExpression initialInterpreter;

    /**
     * @param context
     * @param discount
     */
    public InterpreterExpressionArithmetic(String context, Boolean discount) {

        Stack<InterpreterExpression> stackInterpreter = new Stack<>();
        List<String> elements = Arrays.asList(context.split(" "));
        Iterator<String> iterator = elements.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.matches("\\d+(\\.\\d*)?")) {
                stackInterpreter.push(new Number(Double.parseDouble(element)));
            } else if (element.equals("*")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Invalid Expression");
                }
                Number leftElement = (Number) stackInterpreter.pop();
                var rightElement = new Number(Double.parseDouble(iterator.next()));
                var interpreter = new Multipli(leftElement, rightElement);
                stackInterpreter.push(new Number(interpreter.interpreter()));
            } else if (element.equals("+")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Invalid Expression");
                }
                Number leftElement = (Number) stackInterpreter.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Sum interpreter = new Sum(leftElement, rightElement);
                stackInterpreter.push(new Number(interpreter.interpreter()));
            } else if (element.equals("-")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Invalid Expression");
                }
                Number leftElement = (Number) stackInterpreter.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Subtract subtract = new Subtract(leftElement, rightElement);
                stackInterpreter.push(new Number(subtract.interpreter()));
            } else if (element.equals("/")) {
                if (!iterator.hasNext()) {
                    throw new IllegalArgumentException("Invalid Expression");
                }
                Number leftElement = (Number) stackInterpreter.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                if (rightElement.getNumber() == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                Division division = new Division(leftElement, rightElement);
                stackInterpreter.push(new Number(division.interpreter()));
            } else {
                throw new IllegalArgumentException("Expression with invalid element");
            }
        }

        if (!stackInterpreter.isEmpty() && !discount) { // $COVERAGE-IGNORE$
            Number result = (Number) stackInterpreter.pop();
            while (!stackInterpreter.isEmpty()) {
                Number nextNumber = (Number) stackInterpreter.pop();
                Sum sum = new Sum(result, nextNumber);
                result = new Number(sum.interpreter());
            }
            initialInterpreter = result;
        } else if (!stackInterpreter.isEmpty() && discount) { // $COVERAGE-IGNORE$
            if (stackInterpreter.size() > 1) {
                throw new IllegalArgumentException("Invalid Expression");
            }
            initialInterpreter = stackInterpreter.pop();
        }

    }

    public double interpreter() {
        return initialInterpreter.interpreter();
    }
}
