package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SumOfPrefixScoresOfStringsTest {
    private final SumOfPrefixScoresOfStrings test = new SumOfPrefixScoresOfStrings();

    @Test
    void first() {
        assertArrayEquals(new int[]{4}, test.sumPrefixScores(new String[]{"abcd"}));
    }

    @Test
    void second() {
        assertArrayEquals(new int[]{5, 4, 3, 2}, test.sumPrefixScores(new String[]{"abc", "ab", "bc", "b"}));
    }
}
