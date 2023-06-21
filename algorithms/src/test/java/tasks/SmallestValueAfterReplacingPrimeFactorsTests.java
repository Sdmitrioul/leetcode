package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestValueAfterReplacingPrimeFactorsTests {
    private final SmallestValueAfterReplacingPrimeFactors tested = new SmallestValueAfterReplacingPrimeFactors();

    @Test
    void smallestValue() {
        assertEquals(5, tested.smallestValue(15));
    }

    @Test
    void secondValue() {
        assertEquals(3, tested.smallestValue(3));
    }

    @Test
    void testThirdValue() {
        assertEquals(4, tested.smallestValue(4));
    }

    @Test
    void testFourtValue() {
        assertEquals(5, tested.smallestValue(9));
    }
}