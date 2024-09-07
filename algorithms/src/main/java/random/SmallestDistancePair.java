package random;

import java.util.Arrays;

public class SmallestDistancePair {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int[] diffs = new int[nums[nums.length - 1] - nums[0] + 1];

        for (int i = 0; i < nums.length - 1; i++) {
            int prev = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int diff = Math.abs(prev - nums[j]);
                diffs[diff]++;
            }
        }

        int sum = 0;
        for (int i = 0; i < diffs.length; i++) {
            sum += diffs[i];
            if (sum >= k) {
                return i;
            }
        }

        throw new RuntimeException("No smallest distance pair");
    }
}
