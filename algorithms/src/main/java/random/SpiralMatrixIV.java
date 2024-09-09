package random;

import utils.ListNode;

public class SpiralMatrixIV {
    private static final int[] HORIZONTAL_DIRECTION = new int[]{1, 0, -1, 0};
    private static final int[] VERTICAL_DIRECTION = new int[]{0, 1, 0, -1};
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        int indexHorizontal = 0;
        int left = 0;
        int right = 0;
        int indexVertical = 0;
        int top = 0;
        int bottom = 0;
        int direction = 0;
        while (m > top + bottom && n > left + right) {
            while (indexVertical < m - bottom && indexVertical >= top &&
                    indexHorizontal < n - right && indexHorizontal >= left &&
                    res[indexVertical][indexHorizontal] == 0)
            {
                res[indexVertical][indexHorizontal] = head == null ? -1 : head.val;
                head = head != null ? head.next : null;
                indexHorizontal += HORIZONTAL_DIRECTION[direction];
                indexVertical += VERTICAL_DIRECTION[direction];
            }
            indexHorizontal -= HORIZONTAL_DIRECTION[direction];
            indexVertical -= VERTICAL_DIRECTION[direction];
            top += direction == 0 ? 1 : 0;
            right += direction == 1 ? 1 : 0;
            bottom += direction == 2 ? 1 : 0;
            left += direction == 3 ? 1 : 0;
            direction++;
            direction %= 4;
            indexHorizontal += HORIZONTAL_DIRECTION[direction];
            indexVertical += VERTICAL_DIRECTION[direction];
        }
        return res;
    }
}
