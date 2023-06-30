package tasks;

import base.TreeNode;

import java.util.InputMismatchException;

public class Codec {
    private final static char OPEN = '[';
    private final static char CLOSE = ']';
    private final static char DEL = ',';

    private static void check(String data, int i, char ch) {
        if (data.charAt(i) != ch) {
            throw new InputMismatchException("Unsupported input, Expected: " + ch);
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        final StringBuilder sb = new StringBuilder();

        dfs(root, sb);

        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(OPEN).append(CLOSE);
            return;
        }

        sb.append(OPEN);
        dfs(root.left, sb);
        sb.append(DEL).append(root.val).append(DEL);
        dfs(root.right, sb);
        sb.append(CLOSE);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Pair result = reverseDfs(data, 0);

        return result.result;
    }

    private Pair reverseDfs(String data, int i) {
        check(data, i++, OPEN);

        if (data.charAt(i) == CLOSE) {
            return new Pair(null, ++i);
        }

        Pair left = reverseDfs(data, i);

        i = left.offset();

        check(data, i++, DEL);

        int iL = i;
        while (data.charAt(i++) != DEL) {
            //DOING
        }

        int value = Integer.parseInt(data.substring(iL, --i));

        check(data, i++, DEL);

        Pair right = reverseDfs(data, i);

        i = right.offset();

        check(data, i++, CLOSE);

        TreeNode res = new TreeNode(value);
        res.left = left.result();
        res.right = right.result();

        return new Pair(res, i);
    }

    private record Pair(TreeNode result, int offset) {
    }
}
