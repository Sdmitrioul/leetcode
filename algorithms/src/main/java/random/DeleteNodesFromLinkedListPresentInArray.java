package random;

import utils.ListNode;

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