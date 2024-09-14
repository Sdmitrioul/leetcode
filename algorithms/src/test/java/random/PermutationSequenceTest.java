package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationSequenceTest {
    private final PermutationSequence test = new PermutationSequence();

    @Test
    void testPermutationSequence() {
        assertEquals("213", test.getPermutation(3, 3));
    }

    @Test
    void testPermutationSequenceSecond() {
        assertEquals("2314", test.getPermutation(4, 9));
    }

    @Test
    void testPermutationSequenceThird() {
        assertEquals("123", test.getPermutation(3, 1));
    }

    @Test
    void testPermutationSequenceFourth() {
        assertEquals("21", test.getPermutation(2, 2));
    }

    @Test
    void testPermutationSequenceFifth() {
        assertEquals("132", test.getPermutation(3, 2));
    }

    @Test
    void testPermutationSequenceSix() {
        assertEquals("231", test.getPermutation(3, 4));
    }

    @Test
    void testPermutationSequenceSeventh() {
        assertEquals("2134", test.getPermutation(4,  7));
    }
    @Test
    void testPermutationSequenceEight() {
        assertEquals("123", test.getPermutation(3, 1));
    }

}
