package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RankTransformOfAnArrayTest {
    private final RankTransformOfAnArray test = new RankTransformOfAnArray();

    @Test
    public void test() {
        assertArrayEquals(new int[]{4, 1, 2, 3}, test.arrayRankTransform(new int[]{40, 10, 20, 30}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 1, 1}, test.arrayRankTransform(new int[]{100, 100, 100}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3}, test.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}));
    }
}
