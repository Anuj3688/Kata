package kata.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class CloneGraphTest {

    private final CloneGraph solver = new CloneGraph();

    @Test
    void testNormalCase() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        GraphNode clone = solver.solve(node1);
        assertEquals("[1:[2,4], 2:[1,3], 3:[2,4], 4:[1,3]]", signature(clone));
        assertFalse(clone == node1);
    }

    @Test
    void testEdgeCase() {
        GraphNode node1 = new GraphNode(1);
        node1.neighbors.add(node1);
        GraphNode clone = solver.solve(node1);
        assertEquals("[1:[1]]", signature(clone));
        assertFalse(clone == node1);
    }

    @Test
    void testEmptyInput() {
        assertEquals(null, solver.solve(null));
    }

    @Test
    void testSingleElement() {
        GraphNode node1 = new GraphNode(1);
        GraphNode clone = solver.solve(node1);
        assertEquals("[1:[]]", signature(clone));
    }

    @Test
    void testTrickyCase() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        node1.neighbors.add(node2);
        node1.neighbors.add(node3);
        node2.neighbors.add(node1);
        node3.neighbors.add(node1);

        GraphNode clone = solver.solve(node1);
        assertEquals("[1:[2,3], 2:[1], 3:[1]]", signature(clone));
        assertFalse(clone.neighbors.get(0) == node2);
    }

    private String signature(GraphNode node) {
        if (node == null) {
            return null;
        }

        List<String> parts = new ArrayList<String>();
        Queue<GraphNode> queue = new ArrayDeque<GraphNode>();
        Set<Integer> visited = new HashSet<Integer>();
        queue.add(node);
        visited.add(node.val);

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            List<Integer> neighborVals = new ArrayList<Integer>();
            for (GraphNode neighbor : current.neighbors) {
                neighborVals.add(neighbor.val);
                if (!visited.contains(neighbor.val)) {
                    visited.add(neighbor.val);
                    queue.add(neighbor);
                }
            }
            java.util.Collections.sort(neighborVals);
            parts.add(current.val + ":" + neighborVals.toString());
        }

        java.util.Collections.sort(parts);
        return parts.toString();
    }
}
