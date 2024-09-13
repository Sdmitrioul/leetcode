package random;

public class XORQueriesOfASubarray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                result[i] = arr[queries[i][1]];
            } else {
                result[i] = arr[queries[i][1]] ^ arr[queries[i][0] - 1];
            }
        }
        return result;
    }
}
