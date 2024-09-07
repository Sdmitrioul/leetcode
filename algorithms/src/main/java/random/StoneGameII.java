package random;

public class StoneGameII {
    public int stoneGameII(int[] piles) {
        int size = piles.length;
        if (size == 0) return 0;
        if (size == 1) return piles[0];

        return calculate(piles, 0, 1);
    }

    public static int log2(int n){
        if(n <= 0) throw new IllegalArgumentException();
        return 31 - Integer.numberOfLeadingZeros(n);
    }


    private int calculate(int[] piles, int index, int maxIndex) {
        int size = piles.length;

        int[] sums = new int[size];

        sums[size - 1] = piles[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            sums[i] += piles[i] + sums[i + 1];
        }

        int[][] dp = new int[size][log2(size + 1) + 1];

        return calculate(piles, index, maxIndex, sums, dp);
    }

    private int calculate(int[] piles, int index, int maxIndex, int[] sums, int[][] dp) {
        if (index >= piles.length) {
            return 0;
        }

        if (2 * maxIndex >= piles.length) {
            return sums[index];
        }

        if (dp[index][maxIndex] != 0) {
            return dp[index][maxIndex];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 2 * maxIndex; i++) {
            min = Math.min(min, calculate(piles, index + i, Math.max(maxIndex, i), sums, dp));
        }

        dp[index][maxIndex] = sums[index] - min;

        return dp[index][maxIndex];
    }
}
