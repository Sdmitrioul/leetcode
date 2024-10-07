package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumStringLengthAfterRemovingSubstringsTest {
    private final MinimumStringLengthAfterRemovingSubstrings test = new MinimumStringLengthAfterRemovingSubstrings();

    @Test
    public void test() {
        assertEquals(2, test.minLength("ABFCACDB"));
    }

    @Test
    public void test2() {
        assertEquals(5, test.minLength("ACBBD"));
    }
}
