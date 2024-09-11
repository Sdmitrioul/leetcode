package random;

import utils.ListNode;

public class InsertGreatestCommonDivisorsInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curerntNode = head.next;
        while (curerntNode != null) {
            int gsd = getGsd(prev.val, curerntNode.val);
            ListNode newNode = new ListNode(gsd);
            prev.next = newNode;
            newNode.next = curerntNode;
            prev = curerntNode;
            curerntNode = curerntNode.next;
        }
        return head;
    }

    private int getGsd(int a, int b) {
        int x = 0;
        int y = 1;
        int lastx = 1;
        int lasty = 0;
        int temp;
        while (b != 0) {
            int q = a / b; // 2
            int r = a % b; // 5

            a = b; // 15
            b = r; // 5

            temp = x; // 0
            x = lastx - q * x; // 1
            lastx = temp; // 0

            temp = y; // 1
            y = lasty - q * y; // -2
            lasty = temp; //1
        }
        return a;
    }
}
