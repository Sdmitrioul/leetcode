package utils;

import java.util.Deque;
import java.util.LinkedList;

public class TreeNodeBuilder {
    public static TreeNode buildTreeNode(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 0;
        while (index <= values.length - 1) {
            var node = queue.poll();
            if (node == null) {
                continue;
            }
            index++;
            if (index < values.length && values[index] != null) {
                node.left = new TreeNode(values[index]);
                queue.offer(node.left);
            }
            index++;
            if (index < values.length && values[index] != null) {
                node.right = new TreeNode(values[index]);
                queue.offer(node.right);
            }
        }
        return root;
    }
}
