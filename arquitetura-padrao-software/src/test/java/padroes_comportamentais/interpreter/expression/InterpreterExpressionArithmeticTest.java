package padroes_comportamentais.interpreter.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class InterpreterExpressionArithmeticTest {

    @Test
    void testSimpleMultiplication() {
        String expression = "3 * 4";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(12.0, interpreter.interpreter());
    }

    @Test
    void testSimpleAdditionWithDiscount() {
        String expression = "3 + 4";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(7.0, interpreter.interpreter());
    }

    @Test
    void testSimpleSubtraction() {
        String expression = "10 - 4";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(6.0, interpreter.interpreter());
    }

    @Test
    void testSimpleDivision() {
        String expression = "20 / 4";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(5.0, interpreter.interpreter());
    }

    @Test
    void testComplexExpressionWithDiscount() {
        String expression = "10 * 2 - 5 / 1 + 3";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(18.0, interpreter.interpreter());
    }

    @Test
    void testComplexExpressionWithoutDiscount() {
        String expression = "10 * 2 - 5 / 1";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(15.0, interpreter.interpreter());
    }

    @Test
    void testDivisionByZero() {
        String expression = "10 / 0";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void testInvalidExpressionWithExtraOperator() {
        String expression = "10 * 2 - 5 /";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testInvalidElementInExpression() {
        String expression = "10 * 2 - 5 / x";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("For input string: \"x\"", exception.getMessage());
    }

    @Test
    void testSumOfRemainingElementsWhenNoDiscount() {
        String expression = "10 5";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(15.0, interpreter.interpreter());
    }

    @Test
    void testExpressionWithOneElement() {
        String expression = "10";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(10.0, interpreter.interpreter());
    }

    @Test
    void testEmptyExpression() {
        String expression = "";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Expression with invalid element", exception.getMessage());
    }

    @Test
    void testInvalidExpressionMissingOperandForAddition() {
        String expression = "10 +";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testInvalidExpressionMissingOperandForSubtraction() {
        String expression = "10 -";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testInvalidExpressionMissingOperandForDivision() {
        String expression = "10 /";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testInvalidExpressionMissingOperandForMultiplication() {
        String expression = "10 *";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testExpressionWithMultipleNumbersWithoutDiscount() {
        String expression = "10 5 3";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(18.0, interpreter.interpreter());
    }

    @Test
    void testSingleElementWithDiscount2() {
        String expression = "10";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(10.0, interpreter.interpreter());
    }

    @Test
    void testSumOfRemainingElementsWithoutDiscount() {
        String expression = "10 5 3";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(18.0, interpreter.interpreter());
    }

    @Test
    void testMultipleElementsWithDiscountThrowsException() {
        String expression = "10 5 3";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testSingleElementWithDiscount() {
        String expression = "10";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(10.0, interpreter.interpreter());
    }

    // Additional test to cover all branches within the else if block
    @Test
    void testSingleElementWithDiscountAndEmptyStack() {
        String expression = "10";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, true);
        assertEquals(10.0, interpreter.interpreter());
    }

    @Test
    void testMultipleElementsWithDiscountAndEmptyStack() {
        String expression = "10 5";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testSumOfRemainingElementsWithoutDiscount2() {
        // This test should cover the branch if (!stackInterpreter.isEmpty() &&
        // !discount)
        String expression = "10 5 3";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(18.0, interpreter.interpreter());
    }

    @Test
    void testMultipleElementsWithDiscountThrowsException2() {
        // This test should cover the branch else if (!stackInterpreter.isEmpty() &&
        // discount) and throw an exception
        String expression = "10 5 3";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testExpressionWithMultipleNumbersWithDiscoun2t() {
        String expression = "10 5";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    @Test
    void testExpressionWithSingleElementAndNoDiscount() {
        String expression = "10";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(10.0, interpreter.interpreter());
    }

    @Test
    void testExpressionWithMultipleNumbersWithDiscount() {
        String expression = "10 5";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new InterpreterExpressionArithmetic(expression, true);
        });
        assertEquals("Invalid Expression", exception.getMessage());
    }

    // Test to specifically cover the branch where !stackInterpreter.isEmpty() &&
    // !discount
    @Test
    void testRemainingElementsWithoutDiscount() {
        String expression = "10 5 3";
        InterpreterExpressionArithmetic interpreter = new InterpreterExpressionArithmetic(expression, false);
        assertEquals(18.0, interpreter.interpreter()); // This will ensure remaining elements are summed
    }

}
