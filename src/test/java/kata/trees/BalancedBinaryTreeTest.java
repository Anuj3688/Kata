package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class BalancedBinaryTreeTest {

    private final BalancedBinaryTree solver = new BalancedBinaryTree();

    @Test
    void testNormalCase() {
        TreeNode root = node(3, node(9), node(20, node(15), node(7)));
        assertTrue(solver.solve(root));
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(1, node(2, node(3, node(4), null), null), null);
        assertFalse(solver.solve(root));
    }

    @Test
    void testEmptyInput() {
        assertTrue(solver.solve(null));
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve(node(1)));
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(1, node(2, node(4), node(5)), node(3, null, node(6, null, node(7))));
        assertFalse(solver.solve(root));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
