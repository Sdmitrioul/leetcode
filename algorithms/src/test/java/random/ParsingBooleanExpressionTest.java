package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParsingBooleanExpressionTest {
    private final ParsingBooleanExpression test = new ParsingBooleanExpression();

    @Test
    public void test() {
        assertFalse(test.parseBoolExpr("&(|(f))"));
    }

    @Test
    public void test2() {
        assertTrue(test.parseBoolExpr("|(f,f,f,t)"));
    }

    @Test
    public void test3() {
        assertTrue(test.parseBoolExpr("!(&(f,t))"));
    }

    @Test
    public void test4() {
        assertTrue(test.parseBoolExpr("|(&(t,f,t),t)"));
    }
}
