package random;

import java.util.List;

public class SpiralMatrixIII {
    private static final List<Pair> DIRECTIONS = List.of(
            Pair.of(1, 0),
            Pair.of(0, -1),
            Pair.of(-1, 0),
            Pair.of(0, 1));

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][];
        int x2 = Math.max(Math.max(rows - rStart, rStart), Math.max(cStart, cols - cStart));

        Pair current = Pair.of(rStart, cStart);
        int index = 0;
        result[index++] = current.toArr();
        for (int i = 1; i <= x2; i++) {
            current = Pair.of(current.row - 1, current.col + 1);
            for (Pair direction : DIRECTIONS) {
                for (int j = 0; j < i * 2; j++) {
                    current = Pair.of(current.row + direction.row, current.col + direction.col);
                    if (current.row >= 0 && current.row < rows && current.col >= 0 && current.col < cols) {
                        result[index++] = current.toArr();
                    }
                }
            }
        }

        return result;
    }

    private static final class Pair {
        final int row;
        final int col;

        private Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        static Pair of (int row, int col) {
            return new Pair(row, col);
        }

        int[] toArr() {
            return new int[]{row, col};
        }
    }
}
