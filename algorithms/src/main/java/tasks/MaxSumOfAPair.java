package tasks;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfAPair {
    /**
     * You are given a 0-indexed array nums consisting of positive integers.
     * You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i]
     * is equal to that of nums[j].
     * Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices
     * i and j that satisfy the conditions.
     *
     * @param nums - array of positive ints
     * @return - max sum of digits
     */
    public int maximumSum(int[] nums) {
        return baseSolution(nums);
    }

    private int baseSolution(int[] nums) {
        int result = -1;

        final Map<Integer, Integer> sums = new HashMap<>();

        for (int value : nums) {
            final int sum = calculateSum(value);

            final Integer storedValue = sums.get(sum);

            if (storedValue == null) {
                sums.put(sum, value);
                continue;
            }

            result = Math.max(result, value + storedValue);

            if (storedValue < value) {
                sums.put(sum, value);
            }
        }

        return result;
    }

    public int calculateSum(int value) {
        int result = 0;
        while (value > 0) {
            result += value % 10;
            value /= 10;
        }
        return result;
    }
}
