package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPalindromeTest {
    private final ShortestPalindrome test = new ShortestPalindrome();

    @Test
    void first() {
        assertEquals("aaacecaaa", test.shortestPalindrome("aacecaaa"));
    }

    @Test
    void second() {
        assertEquals("dcbabcd", test.shortestPalindrome("abcd"));
    }
}
