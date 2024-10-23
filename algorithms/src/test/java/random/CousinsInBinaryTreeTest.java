package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.TreeNodeBuilder.buildTreeNode;

public class CousinsInBinaryTreeTest {
    private final CousinsInBinaryTree test = new CousinsInBinaryTree();

    @Test
    public void test() {
        assertEquals(buildTreeNode(new Integer[]{0, 0, 0, 7, 7, null, 11}),
                test.replaceValueInTree(buildTreeNode(new Integer[]{5, 4, 9, 1, 10, null, 7})));
    }

    @Test
    public void test2() {
        assertEquals(buildTreeNode(new Integer[]{0, 0, 0}),
                test.replaceValueInTree(buildTreeNode(new Integer[]{3, 1, 2})));
    }
}
