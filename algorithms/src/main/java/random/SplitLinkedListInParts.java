package random;

import utils.ListNode;

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        int amount = size / k;
        size = size % k;
        cur = head;
        for (int i = 0; i < k; i++) {
            res[i] = cur;
            int counter = 0;
            ListNode tmp = cur;
            while (counter < amount && cur != null) {
                tmp = cur;
                cur = cur.next;
                counter++;
            }
            if (size != 0) {
                tmp = cur;
                cur = cur.next;
                size--;
            }
            if (tmp != null) {
                tmp.next = null;
            }
        }
        return res;
    }
}
