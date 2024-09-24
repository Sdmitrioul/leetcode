package random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExtraCharactersInAString {
    public int minExtraChar(String s, String[] dictionary) {
        TreeNode root = TreeNode.buildTree(dictionary);
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        return calculateCharsToRemove(root, dp, 0, s.length(), s);
    }

    private int calculateCharsToRemove(TreeNode root, int[] dp, int i, int length, String s) {
        if (i == length) {
            return 0;
        }
        if (dp[i] != Integer.MIN_VALUE) {
            return dp[i];
        }
        TreeNode node = root;
        int answer = calculateCharsToRemove(root, dp, i + 1, length, s) + 1;
        for (int end = i; end < length; end++) {
            char current = s.charAt(end);
            TreeNode currentNode = node.children.get(current);
            if (currentNode == null) {
                break;
            }
            node = currentNode;
            if (node.isWord) {
                answer = Math.min(answer, calculateCharsToRemove(root, dp, end + 1, length, s));
            }
        }
        dp[i] = answer;
        return dp[i];
    }
}

class TreeNode {
    final Map<Character, TreeNode> children = new HashMap<>();
    boolean isWord = false;

    static TreeNode buildTree(String[] dictionary) {
        TreeNode root = new TreeNode();
        for (String word : dictionary) {
            TreeNode node = root;
            for (char c : word.toCharArray()) {
                node = node.children.computeIfAbsent(c, k -> new TreeNode());
            }
            node.isWord = true;
        }
        return root;
    }
}