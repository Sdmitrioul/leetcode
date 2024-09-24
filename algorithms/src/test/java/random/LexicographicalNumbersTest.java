package random;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LexicographicalNumbersTest {
    private LexicographicalNumbers test = new LexicographicalNumbers();

    @Test
    void first() {
        assertEquals(
                List.of(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9),
                test.lexicalOrder(13)
        );
    }

    @Test
    void second() {
        assertEquals(
                List.of(1, 2),
                test.lexicalOrder(2)
        );
    }

    @Test
    void third() {
        assertEquals(
                List.of(1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 3, 30, 31, 32, 33, 34, 4, 5, 6, 7, 8, 9),
                test.lexicalOrder(34)
        );
    }
}
