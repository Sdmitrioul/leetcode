package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class XORQueriesOfASubarrayTest {
    private final XORQueriesOfASubarray test = new XORQueriesOfASubarray();

    @Test
    void first() {
        assertArrayEquals(new int[]{2, 7, 14, 8}, test.xorQueries(
                new int[]{1, 3, 4, 8},
                new int[][]{new int[]{0, 1}, new int[]{1, 2}, new int[]{0, 3}, new int[]{3, 3}}));
    }

    @Test
    void second() {
        assertArrayEquals(new int[]{8, 0, 4, 4}, test.xorQueries(
                new int[]{4, 8, 2, 10},
                new int[][]{new int[]{2, 3}, new int[]{1, 3}, new int[]{0, 0}, new int[]{0, 3}}));
    }
}
