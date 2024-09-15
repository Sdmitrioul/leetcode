package random;

public class LongestSubarrayWithMaximumBitwiseAND {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int length = 0;
        int prevMaxLength = 0;
        int prev = 0;
        for (int value : nums) {
            if (value == prev && prev == max) {
                length++;
            } else if (value == max) {
                prevMaxLength = Math.max(length, prevMaxLength);
                length = 1;
                prev = max;
            } else if (value > max) {
                max = value;
                prev = max;
                length = 1;
            } else {
                prev = value;
            }
        }
        return Math.max(length, prevMaxLength);
    }
}
