package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfMaximumBitwiseORSubsetsTest {
    private final CountNumberOfMaximumBitwiseORSubsets test = new CountNumberOfMaximumBitwiseORSubsets();

    @Test
    public void test() {
        assertEquals(2, test.countMaxOrSubsets(new int[]{3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(7, test.countMaxOrSubsets(new int[]{2, 2, 2}));
    }

    @Test
    public void test3() {
        assertEquals(6, test.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }
}
