package random;

import utils.ListNode;
import utils.Pair;
import utils.TreeNode;

import java.util.*;

public class LinkedListInBinaryTree {
    public boolean isSubPathSlow(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();

            Deque<Pair<TreeNode, ListNode>> stack = new ArrayDeque<>();
            stack.push(new Pair<>(node, head));
            while (!stack.isEmpty()) {
                var value = stack.pop();
                var curr = value.first();
                var list = value.second();
                if (list == null) {
                    return true;
                }
                if (curr == null) {
                    continue;
                }
                if (curr.val == list.val) {
                    stack.push(new Pair<>(curr.left, list.next));
                    stack.push(new Pair<>(curr.right, list.next));
                }
            }

            if (node.left != null) {
                queue.push(node.left);
            }
            if (node.right != null) {
                queue.push(node.right);
            }
        }
        return false;
    }

    public boolean isSubPath(ListNode list, TreeNode root) {
        ListNode head = list;
        List<Integer> pattern = new ArrayList<>();
        List<Integer> prefix = new ArrayList<>();
        prefix.add(-1);
        prefix.add(0);
        int patternIndex = 0;
        pattern.add(head.val);
        head = head.next;
        while (head != null) {
            int value = head.val;
            while (patternIndex >= 0) {
                if (value == pattern.get(patternIndex)) {
                    break;
                }
                patternIndex = prefix.get(patternIndex);
            }
            patternIndex += 1;
            pattern.add(head.val);
            prefix.add(patternIndex);
            head = head.next;
        }
        return searchInTree(root, 0, pattern, prefix);
    }

    private boolean searchInTree(TreeNode root, int index, List<Integer> pattern, List<Integer> prefix) {
        if (root == null) {
            return false;
        }
        while (index >= 0) {
            if (root.val == pattern.get(index)) {
                break;
            }
            index = prefix.get(index);
        }
        index += 1;
        if (index == pattern.size()) {
            return true;
        }
        return searchInTree(root.left, index, pattern, prefix) ||
                        searchInTree(root.right, index, pattern, prefix);
    }
}
