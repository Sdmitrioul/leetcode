package random;

public class CheckIfArrayPairsAreDivisibleByK {
    public boolean canArrange(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= k;
            if (arr[i] < 0) {
                arr[i] += k;
            }
        }
        int[] res = new int[k];
        for (int value : arr) {
            int mirror = (k - value) % k;
            if (res[mirror] == 0) {
                res[value]++;
            } else {
                res[mirror]--;
            }
        }
        for (int i = 0; i < k; i++) {
            if (res[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
