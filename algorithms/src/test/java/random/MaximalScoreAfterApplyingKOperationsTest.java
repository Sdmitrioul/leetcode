package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalScoreAfterApplyingKOperationsTest {
    private final MaximalScoreAfterApplyingKOperations test = new MaximalScoreAfterApplyingKOperations();

    @Test
    public void test() {
        assertEquals(50l, test.maxKelements(new int[]{10, 10, 10, 10, 10}, 5));
    }

    @Test
    public void test2() {
        assertEquals(17l, test.maxKelements(new int[]{1, 10, 3, 3, 3}, 3));
    }
}
