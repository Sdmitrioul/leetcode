package random;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        ListNode nHead = null;
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            boolean condition = !set.contains(current.val);
            if (condition && prev != null) {
                prev.next = current;
                prev = current;
            } else if (condition) {
                nHead = current;
                prev = current;
            }
            current = current.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        return nHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int[] vals) {
        this(vals[0]);
        ListNode cur = this;
        for (int i = 1; i < vals.length; i++) {
            cur.next = new ListNode(vals[i]);
            cur = cur.next;
        }
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        if (next != null) {
            return val + " -> " + next.toString();
        }
        return val + " -> null";
    }
}