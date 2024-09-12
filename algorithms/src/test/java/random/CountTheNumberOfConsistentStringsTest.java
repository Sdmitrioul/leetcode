package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheNumberOfConsistentStringsTest {
    private final  CountTheNumberOfConsistentStrings  test = new CountTheNumberOfConsistentStrings();

    @Test
    void first() {
        assertEquals(2, test.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }

    @Test
    void second() {
        assertEquals(7, test.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }

    @Test
    void third() {
        assertEquals(4, test.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
}
