package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindKthBitInNthBinaryStringTest {
    private final FindKthBitInNthBinaryString test = new FindKthBitInNthBinaryString();

    @Test
    public void test() {
        assertEquals('0', test.findKthBit(3, 1));
    }

    @Test
    public void test2() {
        assertEquals('1', test.findKthBit(4, 11));
    }

    @Test
    public void test3() {
        assertEquals('0', test.findKthBit(3, 5));
    }
}
