package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestHappyStringTest {
    private final LongestHappyString test = new LongestHappyString();

    @Test
    public void test() {
        assertEquals("ccaccbcc".length(), test.longestDiverseString(1, 1, 7).length());
    }

    @Test
    public void test2() {
        assertEquals("aabaa".length(), test.longestDiverseString(7, 1, 0).length());
    }
}
