package random;

public class Construct2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (n * m != original.length) {
            return new int[][]{};
        }
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int pos = i * n + j;
                if (pos >= original.length) {
                    return res;
                }

                res[i][j] = original[pos];
            }
        }

        return res;
    }
}
