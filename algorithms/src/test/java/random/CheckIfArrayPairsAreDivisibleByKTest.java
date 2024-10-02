package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfArrayPairsAreDivisibleByKTest {
    private final CheckIfArrayPairsAreDivisibleByK test = new CheckIfArrayPairsAreDivisibleByK();

    @Test
    public void test() {
        assertTrue(test.canArrange(new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5));
    }

    @Test
    public void tes2() {
        assertTrue(test.canArrange(new int[]{1, 2, 3, 4, 5, 6}, 7));
    }

    @Test
    public void test3() {
        assertFalse(test.canArrange(new int[]{1, 2, 3, 4, 5, 6}, 10));
    }

    @Test
    public void test4() {
        assertFalse(test.canArrange(new int[]{-1, 1, -2, 2, -3, 3, -4, 4}, 3));
    }
}
