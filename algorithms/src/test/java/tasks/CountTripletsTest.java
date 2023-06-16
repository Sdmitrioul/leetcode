package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTripletsTest {
    private final CountTriplets checker = new CountTriplets();

    @Test
    void base() {
        assertEquals(4, test(new int[]{2, 3, 1, 6, 7}));
        assertEquals(10, test(new int[]{1, 1, 1, 1, 1}));
    }

    private int test(int[] array) {
        return checker.countTriplets(array);
    }
}
