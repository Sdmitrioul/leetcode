package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestInLexicographicalOrderTest {
    private final KthSmallestInLexicographicalOrder test = new KthSmallestInLexicographicalOrder();

    @Test
    void first() {
        assertEquals(10, test.findKthNumber(13, 2));
    }

    @Test
    void second() {
        assertEquals(1, test.findKthNumber(1, 1));
    }

    @Test
    void third() {
        assertEquals(416126219, test.findKthNumber(681692778, 351251360));
    }
}
