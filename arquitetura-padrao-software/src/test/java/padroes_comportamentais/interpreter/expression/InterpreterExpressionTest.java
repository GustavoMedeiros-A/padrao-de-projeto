package padroes_comportamentais.interpreter.expression;

import static org.junit.Assert.assertEquals;

import java.beans.Expression;

import org.junit.jupiter.api.Test;

public class InterpreterExpressionTest {

    @Test
    public void testExpressions() {
        var sum = new Sum(new Number(1), new Number(2));
        var multi = new Multipli(new Number(3), new Number(2));
        var sub = new Subtract(new Number(3), new Number(2));
        var divison = new Division(new Number(2), new Number(4));

        assertEquals(3.0, sum.interpreter(), 0.1);
        assertEquals(6.0, multi.interpreter(), 0.1);
        assertEquals(1.0, sub.interpreter(), 0.1);
        assertEquals(0.5, divison.interpreter(), 0.1);

    }

}
