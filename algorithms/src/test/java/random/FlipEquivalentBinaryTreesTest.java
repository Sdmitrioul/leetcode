package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.TreeNodeBuilder.buildTreeNode;

public class FlipEquivalentBinaryTreesTest {
    private final FlipEquivalentBinaryTrees test = new FlipEquivalentBinaryTrees();

    @Test
    public void test() {
        assertTrue(test.flipEquiv(
                buildTreeNode(new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8}),
                buildTreeNode(new Integer[]{1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7})));
    }

    @Test
    public void test2() {
        assertTrue(test.flipEquiv(buildTreeNode(new Integer[]{}), buildTreeNode(new Integer[]{})));
    }

    @Test
    public void test3() {
        assertFalse(test.flipEquiv(buildTreeNode(new Integer[]{}), buildTreeNode(new Integer[]{1})));
    }
}
