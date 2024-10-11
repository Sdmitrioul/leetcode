package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumWidthRampTest {
    private final MaximumWidthRamp test = new MaximumWidthRamp();

    @Test
    public void test() {
        assertEquals(4, test.maxWidthRamp(new int[]{6, 0, 8, 2, 1, 5}));
    }

    @Test
    public void test2() {
        assertEquals(7, test.maxWidthRamp(new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1}));
    }
}
