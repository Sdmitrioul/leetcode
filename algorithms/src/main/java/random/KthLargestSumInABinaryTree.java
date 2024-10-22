package random;

import utils.TreeNode;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class KthLargestSumInABinaryTree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Deque<TreeNode> nodesQueue = new LinkedList<>();
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        int currentLevel = 1;
        long currentSum = 0;
        int nextLevel = 0;
        nodesQueue.offer(root);
        while (!nodesQueue.isEmpty()) {
            TreeNode node = nodesQueue.poll();
            currentLevel--;
            if (node.left != null) {
                nodesQueue.offer(node.left);
                nextLevel++;
            }
            if (node.right != null) {
                nodesQueue.offer(node.right);
                nextLevel++;
            }
            currentSum += node.val;
            if (currentLevel == 0) {
                queue.add(currentSum);
                currentSum = 0;
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
        while (--k != 0 && !queue.isEmpty()) {
            queue.poll();
        }
        return queue.isEmpty() ? -1 : queue.poll();
    }
}
