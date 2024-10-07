package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationInStringTest {
    private final PermutationInString test = new PermutationInString();

    @Test
    public void test() {
        assertTrue(test.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void test2() {
        assertFalse(test.checkInclusion("ab", "eidboaoo"));
    }
}
