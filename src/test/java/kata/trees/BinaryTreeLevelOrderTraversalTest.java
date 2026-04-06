package kata.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal solver = new BinaryTreeLevelOrderTraversal();

    @Test
    void testNormalCase() {
        TreeNode root = node(3, node(9), node(20, node(15), node(7)));
        assertEquals(Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        ), solver.solve(root));
    }

    @Test
    void testEdgeCase() {
        TreeNode root = node(1, node(2), null);
        assertEquals(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2)
        ), solver.solve(root));
    }

    @Test
    void testEmptyInput() {
        assertEquals(Arrays.<List<Integer>>asList(), solver.solve(null));
    }

    @Test
    void testSingleElement() {
        assertEquals(Arrays.asList(Arrays.asList(5)), solver.solve(node(5)));
    }

    @Test
    void testTrickyCase() {
        TreeNode root = node(1, node(2, node(4), node(5)), node(3, null, node(6)));
        assertEquals(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        ), solver.solve(root));
    }

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }
}
