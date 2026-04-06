package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree solver = new ValidateBinarySearchTree();

    @Test
    void testNormalCase() {
        TreeNode root = node(2, node(1), node(3));
        assertTrue(solver.solve(root));
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(5, node(1), node(4, node(3), node(6)));
        assertFalse(solver.solve(root));
    }

    @Test
    void testEmptyInput() {
        assertTrue(solver.solve(null));
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve(node(8)));
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(10, node(5), node(15, node(6), node(20)));
        assertFalse(solver.solve(root));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
