package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {
    private final LargestNumber test = new LargestNumber();

    @Test
    void first() {
        assertEquals("210", test.largestNumber(new int[]{10, 2}));
    }

    @Test
    void second() {
        assertEquals("9534330", test.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    void third() {
        assertEquals("0", test.largestNumber(new int[]{0, 0}));
    }
}
