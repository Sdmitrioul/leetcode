package random;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        int maxWidth = 0;
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[i] < nums[stack.peek()]) {
                stack.push(i);
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                maxWidth = Math.max(maxWidth, i - stack.pop());
            }
        }
        System.gc();
        return maxWidth;
    }
}
