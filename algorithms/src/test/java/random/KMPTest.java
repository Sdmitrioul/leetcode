package random;

import algorithms.KMP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KMPTest {
    @Test
    void first() {
        assertArrayEquals(new int[]{-1, 0, 0, 1, 2, 3, 4, 0, 1}, KMP.getPrefixTable("cacacabc"));
    }
}
