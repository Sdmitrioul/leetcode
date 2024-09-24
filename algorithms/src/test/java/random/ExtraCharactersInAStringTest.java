package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraCharactersInAStringTest {
    private final ExtraCharactersInAString test = new ExtraCharactersInAString();

    @Test
    void first() {
        assertEquals(1, test.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"}));
    }

    @Test
    void second() {
        assertEquals(3, test.minExtraChar("sayhelloworld", new String[]{"hello", "world"}));
    }
}
