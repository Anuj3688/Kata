package kata.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class NumberOfIslandsTest {

    private final NumberOfIslands solver = new NumberOfIslands();

    @Test
    void testNormalCase() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solver.solve(grid));
    }

    @Test
    void testEdgeCase() {
        char[][] grid = {
                {'1', '0', '1'},
                {'0', '1', '0'},
                {'1', '0', '1'}
        };
        assertEquals(5, solver.solve(grid));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new char[][]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solver.solve(new char[][]{{'1'}}));
    }

    @Test
    void testTrickyCase() {
        char[][] grid = {
                {'1', '1', '0', '0'},
                {'1', '0', '0', '1'},
                {'0', '0', '1', '1'}
        };
        assertEquals(2, solver.solve(grid));
    }
}
