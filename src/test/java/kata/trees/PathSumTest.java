package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class PathSumTest {

    private final PathSum solver = new PathSum();

    @Test
    void testNormalCase() {
        TreeNode root = node(
                5,
                node(4, node(11, node(7), node(2)), null),
                node(8, node(13), node(4, null, node(1)))
        );
        assertTrue(solver.solve(root, 22));
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(1, node(2), node(3));
        assertFalse(solver.solve(root, 5));
    }

    @Test
    void testEmptyInput() {
        assertFalse(solver.solve(null, 0));
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve(node(7), 7));
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(1, node(2, node(3), null), node(4));
        assertFalse(solver.solve(root, 3));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
