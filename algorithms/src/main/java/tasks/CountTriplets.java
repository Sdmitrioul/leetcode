package tasks;

import java.util.HashMap;
import java.util.Map;

public class CountTriplets {

    /**
     * We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
     * Let's define a and b as follows:
     * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
     * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
     * Note that ^ denotes the bitwise-xor operation.
     *
     * @param arr - Given an array of integers
     * @return - the number of triplets (i, j and k) Where a == b.
     */
    public int countTriplets(int[] arr) {
        return countTripletsFastest(arr);
    }

    /*
    arr[i] ^ arr[i + 1] ^ ... ^ arr[k] = 0
    arr[0] ^ arr[k] = arr[0] ^ arr[1] ^ ... ^ arr[i - 1]
    prefix[i] == prefix[k + 1]
     */
    private int countTripletsFastest(int[] arr) {
        int counter = 0;

        int[] prefix = new int[arr.length + 1];

        for (int i = 1; i < arr.length + 1; i++) {
            prefix[i] = arr[i - 1] ^ prefix[i - 1];
        }

        Map<Integer, Integer> prefixesCount = new HashMap<>();
        Map<Integer, Integer> lengthOfIndexes = new HashMap<>();

        for (int i = 0; i < prefix.length; i++) {
            int current = prefix[i];
            int count = prefixesCount.getOrDefault(current, 0);
            int length = lengthOfIndexes.getOrDefault(current, 0);

            counter += count * (i - 1) - length;

            prefixesCount.put(current, count + 1);
            lengthOfIndexes.put(current, length + i);
        }

        return counter;
    }

    /*
    a == b
    a ^ a = b ^ a
    a ^ a = 0 (second property)
    b ^ a = a ^ b (commutativity property)
    a ^ b = 0
    arr[i] ^ arr[i + 1] ^ ... ^ arr[k] = 0
     */
    private int countTripletsFaster(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                a ^= arr[j];

                if (a == 0) {
                    counter += (j - i);
                }
            }
        }

        return counter;
    }

    /*
    Slow
     */
    private int countTripletsMedium(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (j != i + 1) {
                    a ^= arr[j - 1];
                }

                int b = arr[j];
                for (int k = j; k < arr.length; k++) {
                    if (k != j) {
                        b ^= arr[k];
                    }

                    if (a == b) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }


    /*
    Timeout
     */
    private int countTripletsEasy(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (check(arr, i, j, k)) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }

    private boolean check(int[] arr, int i, int j, int k) {
        int a = arr[i];
        int b = arr[j];

        for (int l = i + 1; l < j; l++) {
            a ^= arr[l];
        }

        for (int l = j + 1; l <= k; l++) {
            b ^= arr[l];
        }

        return a == b;
    }
}
