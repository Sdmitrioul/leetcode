package random;

public class CountNumberOfMaximumBitwiseORSubsets {
    public int countMaxOrSubsets(int[] nums) {
        int[] ors = new int[1 << 17];
        ors[0] = 1;
        int max = 0;
        for (int num : nums) {
            for (int i = max; i >= 0; i--) {
                ors[i | num] += ors[i];
            }
            max |= num;
        }
        return ors[max];
    }
}
