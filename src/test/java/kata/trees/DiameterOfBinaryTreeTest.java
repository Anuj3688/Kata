package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree solver = new DiameterOfBinaryTree();

    @Test
    void testNormalCase() {
        TreeNode root = node(1, node(2, node(4), node(5)), node(3));
        assertEquals(3, solver.solve(root));
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(1, node(2), null);
        assertEquals(1, solver.solve(root));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(null));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, solver.solve(node(1)));
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(1, node(2, node(4, node(8), null), null), node(3));
        assertEquals(4, solver.solve(root));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
