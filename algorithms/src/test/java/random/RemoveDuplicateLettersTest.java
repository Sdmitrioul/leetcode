package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateLettersTest {
    private final RemoveDuplicateLetters test = new RemoveDuplicateLetters();

    @Test
    public void removeDuplicateLetters() {
        assertEquals("abc", test.removeDuplicateLetters("bcabc"));
    }

    @Test
    public void removeDuplicateLetters2() {
        assertEquals("acdb", test.removeDuplicateLetters("cbacdcbc"));
    }
}
