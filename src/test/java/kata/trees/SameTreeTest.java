package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class SameTreeTest {

    private final SameTree solver = new SameTree();

    @Test
    void testNormalCase() {
        TreeNode a = node(1, node(2), node(3));
        TreeNode b = node(1, node(2), node(3));
        assertTrue(solver.solve(a, b));
    }

    @Test
    void testEdgeCase() {
        TreeNode a = node(1, node(2), null);
        TreeNode b = node(1, null, node(2));
        assertFalse(solver.solve(a, b));
    }

    @Test
    void testEmptyInput() {
        assertTrue(solver.solve(null, null));
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve(node(1), node(1)));
    }

    @Test
    void testTrickyCase() {
        TreeNode a = node(1, node(2, node(4), null), node(3));
        TreeNode b = node(1, node(2, null, node(4)), node(3));
        assertFalse(solver.solve(a, b));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
