package padroes_comportamentais.interpreter.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class InterpreterExpressionArithmeticTest {

    @Test
    void shouldCalculateSum() {
        InterpreterExpression interpreter = new InterpreterExpressionArithmetic("6 + 2", false);
        assertEquals(8.0, interpreter.interpreter());
    }

    @Test
    void shouldCalculateSub() {
        InterpreterExpression interpreter = new InterpreterExpressionArithmetic("6 - 2", false);
        assertEquals(4.0, interpreter.interpreter());
    }

    @Test
    void shouldCalculateMultipl() {
        InterpreterExpression interpreter = new InterpreterExpressionArithmetic("6 * 2", false);
        assertEquals(12.0, interpreter.interpreter());
    }

    @Test
    void shouldCalculateDivision() {
        InterpreterExpression interpreter = new InterpreterExpressionArithmetic("6 / 2", false);
        assertEquals(3.0, interpreter.interpreter());
    }

    @Test
    void shouldCalculateCombineExpression() {
        InterpreterExpression interpreter = new InterpreterExpressionArithmetic("10 / 2 * 3 + 1 - 4", false);
        assertEquals(12.0, interpreter.interpreter());
    }

    @Test
    void shouldReturnExceptionWhenPassInvalidElement() {
        try {
            InterpreterExpression interpreter = new InterpreterExpressionArithmetic("2 ^ 2", false);
            assertEquals(4.0, interpreter.interpreter());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Expression with invalid element", e.getMessage());
        }
    }

    @Test
    void shouldReturnInvalidException() {
        try {
            InterpreterExpression interpreter = new InterpreterExpressionArithmetic("2 + ", false);
            assertEquals(4.0, interpreter.interpreter());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid Expression", e.getMessage());
        }
    }

}
