package dp;

import java.util.Deque;
import java.util.LinkedList;

public class JumpsThird {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        Deque<Integer> stack = new LinkedList<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int value = stack.pollFirst();
            int jump = arr[value];

            if (jump == 0) {
                return true;
            }

            int left = value - jump;
            int right = value + jump;

            if (left >= 0 && !visited[left]) {
                visited[left] = true;
                stack.push(left);
            }

            if (right < arr.length && !visited[right]) {
                visited[right] = true;
                stack.push(right);
            }
        }

        return false;
    }
}
