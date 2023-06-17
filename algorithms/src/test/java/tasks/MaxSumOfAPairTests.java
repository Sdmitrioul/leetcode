package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumOfAPairTests {
    private final MaxSumOfAPair maxSumOfAPair = new MaxSumOfAPair();

    @Test
    void testSumOfNumbers() {
        assertEquals(10, maxSumOfAPair.calculateSum(55));
        assertEquals(33, maxSumOfAPair.calculateSum(88881));
        assertEquals(2, maxSumOfAPair.calculateSum(11));
    }

    @Test
    void baseTests() {
        assertEquals(54, maxSumOfAPair.maximumSum(new int[]{18, 43, 36, 13, 7}));
        assertEquals(-1, maxSumOfAPair.maximumSum(new int[]{10, 12, 19, 14}));
    }
}