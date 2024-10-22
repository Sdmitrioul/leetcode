package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.TreeNodeBuilder.buildTreeNode;

public class KthLargestSumInABinaryTreeTest {
    private final KthLargestSumInABinaryTree test = new KthLargestSumInABinaryTree();

    @Test
    public void test() {
        assertEquals(13, test.kthLargestLevelSum(buildTreeNode(new Integer[]{5, 8, 9, 2, 1, 3, 7, 4, 6}), 2));
    }

    @Test
    public void test2() {
        assertEquals(3, test.kthLargestLevelSum(buildTreeNode(new Integer[]{1, 2, null, 3}), 1));
    }
}
