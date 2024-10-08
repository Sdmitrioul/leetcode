package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfSwapsToMakeTheStringBalancedTest {
    private final MinimumNumberOfSwapsToMakeTheStringBalanced test = new MinimumNumberOfSwapsToMakeTheStringBalanced();

    @Test
    public void test() {
        assertEquals(1, test.minSwaps("][]["));
    }

    @Test
    public void test2() {
        assertEquals(2, test.minSwaps("]]][[["));
    }

    @Test
    public void test3() {
        assertEquals(0, test.minSwaps("[]"));
    }
}
