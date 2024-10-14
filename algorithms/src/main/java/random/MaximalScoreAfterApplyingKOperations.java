package random;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximalScoreAfterApplyingKOperations {
    public long maxKelements(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }
        long result = 0;
        for (int i = 0; i < k; i++) {
            int max = queue.poll();
            result += max;
            queue.add(Math.ceilDiv(max , 3));
        }
        return result;
    }
}
