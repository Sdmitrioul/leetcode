package tasks;

import base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CodecTests {
    private final Codec tested = new Codec();

    @Test
    void elementNull() {
        String ser = tested.serialize(null);
        assertNull(tested.deserialize(ser));
    }

    @Test
    void element() {
        TreeNode treeNode = new TreeNode(1);

        String ser = tested.serialize(treeNode);
        assertEquals(treeNode, tested.deserialize(ser));
    }

    @Test
    void elementHard() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        String ser = tested.serialize(treeNode);
        assertEquals(treeNode, tested.deserialize(ser));
    }
}