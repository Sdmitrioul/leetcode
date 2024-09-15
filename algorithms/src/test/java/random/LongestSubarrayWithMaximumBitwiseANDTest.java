package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayWithMaximumBitwiseANDTest {
    private final LongestSubarrayWithMaximumBitwiseAND test = new LongestSubarrayWithMaximumBitwiseAND();

    @Test
    void first() {
        assertEquals(2, test.longestSubarray(new int[]{1, 2, 3, 3, 2, 2}));
    }

    @Test
    void second() {
        assertEquals(1, test.longestSubarray(new int[]{1, 2, 3, 4}));
    }

    @Test
    void third() {
        assertEquals(8, test.longestSubarray(new int[]{311155, 311155, 311155, 311155, 311155, 311155, 311155, 311155, 201191, 311155}));
    }

    @Test
    void fourth() {
        assertEquals(24, test.longestSubarray(new int[]{395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 395808, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 470030, 153490, 330001, 330001, 330001, 330001, 330001, 330001, 330001, 37284, 470030, 470030, 470030, 470030, 470030, 470030, 156542, 226743}));
    }
}
