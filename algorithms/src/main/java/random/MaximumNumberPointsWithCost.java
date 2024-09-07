package random;

import java.util.Arrays;

public class MaximumNumberPointsWithCost {
    public long maxPoints(int[][] points) {
        int columns = points[0].length;
        int rows = points.length;
        long[] currentRow = new long[columns];
        long[] previousRow = new long[columns];
        long[] left = new long[columns];
        long[] right = new long[columns];

        for (int i = 0; i < columns; i++) {
            previousRow[i] = points[0][i];
        }

        for (int i = 0; i < rows - 1; i++) {
            left[0] = previousRow[0];
            right[columns - 1] = previousRow[columns - 1];
            for (int j = 1; j < columns; j++) {
                left[j] = Math.max(left[j - 1] - 1, previousRow[j]);
                right[columns - 1 - j] = Math.max(right[columns - j] - 1, previousRow[columns - 1 - j]);
            }

            for (int j = 0; j < columns; j++) {
                currentRow[j] = Math.max(left[j], right[j]) + points[i + 1][j];
            }

            long[] tmp = previousRow;
            previousRow = currentRow;
            currentRow = tmp;
        }

        return Arrays.stream(previousRow).max().orElse(0);
    }
}
