package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAddToMakeParenthesesValidTest {
    private final MinimumAddToMakeParenthesesValid test = new MinimumAddToMakeParenthesesValid();

    @Test
    public void test() {
        assertEquals(1, test.minAddToMakeValid("())"));
    }

    @Test
    public void test2() {
        assertEquals(3, test.minAddToMakeValid("((("));
    }
}
