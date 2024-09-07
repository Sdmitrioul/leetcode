package random;

public class FindMissingObservations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int all = rolls.length + n;
        int sum = mean * all;
        for (int value : rolls) {
            sum -= value;
        }
        if (sum > 6 * n || sum < n) {
            return new int[0];
        }
        int[] result = new int[n];
        int p = sum % n;
        mean = sum / n;
        int meanInc = mean + 1;
        for (int i = 0; i < n; i++) {
            result[i] = i < p ? meanInc : mean;
        }
        return result;
    }
}
