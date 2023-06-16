package tasks;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTests {
    private final ValidParentheses checker = new ValidParentheses();

    @Test
    void emptyTest() {
        assertTrue(checker.isValid(""));
    }

    @Test
    void oneElement() {
        assertFalse(test("["));
        assertFalse(test("{"));
        assertFalse(test("("));
        assertFalse(test("]"));
        assertFalse(test(")"));
        assertFalse(test("}"));
    }

    @Test
    void validParenthesis() {
        assertTrue(test("()"));
        assertTrue(test("()[]{}"));
        assertTrue(test("()()((()[]{}))[({}){}[]]"));
    }

    @Test
    void invalidParenthesis() {
        assertFalse(test("[}"));
        assertFalse(test("[]{(]}"));
        assertFalse(test("[]}"));
        assertFalse(test("[]{(}"));
        assertFalse(test("{}()[]{(){()[]}}}"));
    }

    @Test
    void wrongInput() {
        Exception exception = assertThrows(InputMismatchException.class, () -> {
            test("[]{}({k)");
        });

        assertEquals("Unsupported parentheses: k", exception.getMessage());

        assertFalse(test("[]{}(}k)"));
    }

    private boolean test(String s) {
        return checker.isValid(s);
    }
}
