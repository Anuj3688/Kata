package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class LowestCommonAncestorTest {

    private final LowestCommonAncestor solver = new LowestCommonAncestor();

    @Test
    void testNormalCase() {
        TreeNode p = node(5);
        TreeNode q = node(1);
        TreeNode root = node(3, p, q);
        assertEquals(3, solver.solve(root, p, q).val);
    }

    @Test
    void testEdgeCase() {
        TreeNode q = node(4);
        TreeNode p = node(2, node(7), q);
        TreeNode root = node(6, p, node(8));
        assertEquals(2, solver.solve(root, p, q).val);
    }

    @Test
    void testEmptyInput() {
        assertEquals(null, solver.solve(null, null, null));
    }

    @Test
    void testSingleElement() {
        TreeNode root = node(1);
        assertEquals(1, solver.solve(root, root, root).val);
    }

    @Test
    void testTrickyCase() {
        TreeNode n7 = node(7);
        TreeNode n4 = node(4);
        TreeNode n2 = node(2, n7, n4);
        TreeNode n6 = node(6);
        TreeNode n5 = node(5, n6, n2);
        TreeNode n0 = node(0);
        TreeNode n8 = node(8);
        TreeNode n1 = node(1, n0, n8);
        TreeNode root = node(3, n5, n1);
        assertEquals(5, solver.solve(root, n6, n4).val);
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
