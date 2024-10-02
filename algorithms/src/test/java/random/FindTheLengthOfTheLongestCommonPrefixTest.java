package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheLengthOfTheLongestCommonPrefixTest {
    private final FindTheLengthOfTheLongestCommonPrefix test = new FindTheLengthOfTheLongestCommonPrefix();

    @Test
    void findLengthOfLongestCommonPrefix() {
        assertEquals(3, test.longestCommonPrefix(new int[]{1, 10, 100}, new int[]{1000}));
    }

    @Test
    void findLengthOfLongestCommonPrefix2() {
        assertEquals(0, test.longestCommonPrefix(new int[]{1, 2, 3}, new int[]{4, 4, 4}));
    }

    @Test
    void findLengthOfLongestCommonPrefix3() {
        assertEquals(2, test.longestCommonPrefix(new int[]{13, 27, 45}, new int[]{21, 27, 48}));
    }
}
