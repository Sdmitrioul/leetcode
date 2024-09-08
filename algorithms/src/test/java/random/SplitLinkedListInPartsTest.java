package random;

import org.junit.jupiter.api.Test;
import utils.ListNode;
import utils.ListNodeBuilder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static utils.ListNodeBuilder.buildListNode;

public class SplitLinkedListInPartsTest {
    private SplitLinkedListInParts test = new SplitLinkedListInParts();

    @Test
    void first() {
        assertArrayEquals(new ListNode[]{
                        new ListNode(1),
                        new ListNode(2),
                        new ListNode(3),
                        null,
                        null},
                test.splitListToParts(buildListNode(new int[]{1, 2, 3}), 5));
    }

    @Test
    void second() {
        assertArrayEquals(new ListNode[]{
                        buildListNode(new int[]{1,2,3,4}),
                        buildListNode(new int[]{5,6,7}),
                        buildListNode(new int[]{8,9,10})},
                test.splitListToParts(buildListNode(new int[]{1,2,3,4,5,6,7,8,9,10}), 3));
    }
/*
    @Test
    void third() {
        assertArrayEquals(new ListNode[]{
                        buildListNode(new int[]{1,2,3,4}),
                        buildListNode(new int[]{5,6,7}),
                        buildListNode(new int[]{8,9,10})},
                test.splitListToParts(buildListNode(new int[]{1,2,3,4,5,6,7,8,9,10}), 3));
    }*/
}
