package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSwapTest {
    private final MaximumSwap test = new MaximumSwap();

    @Test
    public void test() {
        assertEquals(7236, test.maximumSwap(2736));
    }

    @Test
    public void test2() {
        assertEquals(9973, test.maximumSwap(9973));
    }

    @Test
    public void test3() {
        assertEquals(98863, test.maximumSwap(98368));
    }
}
