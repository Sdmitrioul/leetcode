package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ListNodeBuilder.buildListNode;

public class SpiralMatrixIVTest {
    private final SpiralMatrixIV test = new SpiralMatrixIV();

    @Test
    void first() {
        int[][] expected = new int[][]{
                {3,0,2,6,8},
                {5,0,-1,-1,1},
                {5,2,4,9,7}
        };
        int[][] actual = test.spiralMatrix(3, 5, buildListNode(new int[]{3,0,2,6,8,1,7,9,4,2,5,5,0}));
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            int[] e = expected[i];
            int[] a = actual[i];
            assertArrayEquals(e, a);
        }
    }

    @Test
    void second() {
        int[][] expected = new int[][]{
                {0,1,2,-1}
        };
        int[][] actual = test.spiralMatrix(1, 4, buildListNode(new int[]{0,1,2}));
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            int[] e = expected[i];
            int[] a = actual[i];
            assertArrayEquals(e, a);
        }
    }
}
