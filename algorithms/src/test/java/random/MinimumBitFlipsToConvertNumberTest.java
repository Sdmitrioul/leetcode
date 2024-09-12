package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumBitFlipsToConvertNumberTest {
    private final MinimumBitFlipsToConvertNumber test = new MinimumBitFlipsToConvertNumber();

    @Test
    public void one() {
        assertEquals(3, test.minBitFlips(10, 7));
    }

    @Test
    public void two() {
        assertEquals(3, test.minBitFlips(3, 4));
    }

    @Test
    public void three() {
        assertEquals(1, test.minBitFlips(91, 27));
    }
}
