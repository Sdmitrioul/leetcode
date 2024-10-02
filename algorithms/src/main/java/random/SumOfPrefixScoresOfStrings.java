package random;

import java.util.HashMap;
import java.util.Map;

public class SumOfPrefixScoresOfStrings {
    public int[] sumPrefixScores(String[] words) {
        int[] result = new int[words.length];
        TreeNode root = TreeNode.buildTree(words);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            TreeNode node = root;
            int counter = 0;
            for (char c : word.toCharArray()) {
                node = node.children.get(c);
                if (node != null) {
                    counter += node.score;
                } else {
                    break;
                }
            }
            result[i] = counter;
        }
        return result;
    }

    private static class TreeNode {
        Map<Character, TreeNode> children = new HashMap<>();
        int score = 0;

        static TreeNode buildTree(String[] words) {
            TreeNode root = new TreeNode();
            for (String word : words) {
                TreeNode node = root;
                for (char ch : word.toCharArray()) {
                    node = node.children.computeIfAbsent(ch, k -> new TreeNode());
                    node.score++;
                }
            }
            return root;
        }
    }
}
