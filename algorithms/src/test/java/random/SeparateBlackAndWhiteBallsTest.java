package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparateBlackAndWhiteBallsTest {
    private final SeparateBlackAndWhiteBalls test = new SeparateBlackAndWhiteBalls();

    @Test
    public void test() {
        assertEquals(1, test.minimumSteps("101"));
    }

    @Test
    public void test2() {
        assertEquals(2, test.minimumSteps("100"));
    }

    @Test
    public void test3() {
        assertEquals(0, test.minimumSteps("0111"));
    }
}
