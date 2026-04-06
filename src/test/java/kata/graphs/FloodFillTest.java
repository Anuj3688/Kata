package kata.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class FloodFillTest {

    private final FloodFill solver = new FloodFill();

    @Test
    void testNormalCase() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        assertArrayEquals(new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        }, solver.solve(image, 1, 1, 2));
    }

    @Test
    void testEdgeCase() {
        int[][] image = {{0, 0, 0}, {0, 1, 1}};
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}}, solver.solve(image, 1, 1, 1));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[][]{}, solver.solve(new int[][]{}, 0, 0, 2));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[][]{{3}}, solver.solve(new int[][]{{1}}, 0, 0, 3));
    }

    @Test
    void testTrickyCase() {
        int[][] image = {
                {0, 0, 0},
                {0, 1, 1}
        };
        assertArrayEquals(new int[][]{
                {0, 0, 0},
                {0, 2, 2}
        }, solver.solve(image, 1, 1, 2));
    }
}
