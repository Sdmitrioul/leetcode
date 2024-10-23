package random;

import utils.TreeNode;

import java.util.*;

public class CousinsInBinaryTree {
    public TreeNode replaceValueInTree(TreeNode root) {
        Deque<TreeNode> nodesQueue = new LinkedList<>();
        List<Integer> levelsSum = new ArrayList<>();
        int currentLevel = 1;
        int currentSum = 0;
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
                levelsSum.add(currentSum);
                currentSum = 0;
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
        currentLevel = 1;
        nextLevel = 0;
        int levelIndex = 1;
        root.val = 0;
        nodesQueue.offer(root);
        while (!nodesQueue.isEmpty() && levelIndex < levelsSum.size()) {
            TreeNode node = nodesQueue.poll();
            currentLevel--;
            int childrenSum = (node.left != null ? node.left.val : 0) + (node.right != null ? node.right.val : 0);
            int levelSum = levelsSum.get(levelIndex);
            if (node.left != null) {
                nodesQueue.offer(node.left);
                node.left.val = levelSum - childrenSum;
                nextLevel++;
            }
            if (node.right != null) {
                nodesQueue.offer(node.right);
                node.right.val = levelSum - childrenSum;
                nextLevel++;
            }
            if (currentLevel == 0) {
                currentLevel = nextLevel;
                nextLevel = 0;
                levelIndex++;
            }
        }
        return root;
    }
}
