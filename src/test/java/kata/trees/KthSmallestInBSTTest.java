package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class KthSmallestInBSTTest {

    private final KthSmallestInBST solver = new KthSmallestInBST();

    @Test
    void testNormalCase() {
        TreeNode root = node(3, node(1, null, node(2)), node(4));
        assertEquals(1, solver.solve(root, 1));
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(5, node(3, node(2, node(1), null), node(4)), node(6));
        assertEquals(3, solver.solve(root, 3));
    }

    @Test
    void testEmptyInput() {
        assertEquals(-1, solver.solve(null, 1));
    }

    @Test
    void testSingleElement() {
        assertEquals(7, solver.solve(node(7), 1));
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(8, node(3, node(1), node(6)), node(10, null, node(14)));
        assertEquals(6, solver.solve(root, 4));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
