package random;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferentWaysToAddParenthesesTest {
    private final DifferentWaysToAddParentheses test = new DifferentWaysToAddParentheses();

    @Test
    void first() {
        assertEquals(List.of(0, 2), test.diffWaysToCompute("2-1-1"));
    }

    @Test
    void second() {
        assertEquals(List.of(-34, -14, -10, -10, 10), test.diffWaysToCompute("2*3-4*5"));
    }
}
