package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UncommonWordsFromTwoSentencesTest {
    private final UncommonWordsFromTwoSentences test = new UncommonWordsFromTwoSentences();

    @Test
    void first() {
        assertArrayEquals(new String[]{"sweet","sour"}, test.uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }

    @Test
    void second() {
        assertArrayEquals(new String[]{"banana"}, test.uncommonFromSentences("apple apple", "banana"));
    }
}
