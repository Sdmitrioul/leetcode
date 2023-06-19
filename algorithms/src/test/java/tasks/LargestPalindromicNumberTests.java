package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPalindromicNumberTests {
    private final LargestPalindromicNumber tested = new LargestPalindromicNumber();

    @Test
    void largestPalindromic() {
        assertEquals("7449447", tested.largestPalindromic("444947137"));
        assertEquals("9", tested.largestPalindromic("00009"));
        assertEquals("0", tested.largestPalindromic("00000"));
    }
}