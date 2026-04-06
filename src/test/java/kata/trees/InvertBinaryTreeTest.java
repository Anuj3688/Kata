package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class InvertBinaryTreeTest {

    private final InvertBinaryTree solver = new InvertBinaryTree();

    @Test
    void testNormalCase() {
        TreeNode root = node(4, node(2, node(1), node(3)), node(7, node(6), node(9)));
        TreeNode inverted = solver.solve(root);
        assertEquals(7, inverted.left.val);
        assertEquals(2, inverted.right.val);
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(1, node(2), null);
        TreeNode inverted = solver.solve(root);
        assertEquals(2, inverted.right.val);
    }

    @Test
    void testEmptyInput() {
        assertEquals(null, solver.solve(null));
    }

    @Test
    void testSingleElement() {
        TreeNode inverted = solver.solve(node(5));
        assertEquals(5, inverted.val);
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(1, node(2, node(4), null), node(3));
        TreeNode inverted = solver.solve(root);
        assertEquals(3, inverted.left.val);
        assertEquals(2, inverted.right.val);
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
