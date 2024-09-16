package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheLongestSubstringContainingVowelsInEvenCountsTest {
    private final FindTheLongestSubstringContainingVowelsInEvenCounts test = new FindTheLongestSubstringContainingVowelsInEvenCounts();

    @Test
    void first() {
        assertEquals(13, test.findTheLongestSubstring("eleetminicoworoep"));
    }

    @Test
    void second() {
        assertEquals(5, test.findTheLongestSubstring("leetcodeisgreat"));
    }

    @Test
    void third() {
        assertEquals(6, test.findTheLongestSubstring("bcbcbc"));
    }
}
