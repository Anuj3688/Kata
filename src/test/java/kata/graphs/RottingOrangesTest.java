package kata.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class RottingOrangesTest {

    private final RottingOranges solver = new RottingOranges();

    @Test
    void testNormalCase() {
        assertEquals(4, solver.solve(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }));
    }

    @Test
    void testEdgeCase() {
        assertEquals(-1, solver.solve(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new int[][]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, solver.solve(new int[][]{{0}}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(0, solver.solve(new int[][]{{2, 2}, {2, 2}}));
    }

    @Test
    void testAllFreshNoRottenSource() {
        assertEquals(-1, solver.solve(new int[][]{
                {1, 1},
                {1, 1}
        }));
    }

    @Test
    void testSingleFreshOrange() {
        assertEquals(-1, solver.solve(new int[][]{{1}}));
    }

    @Test
    void testAlreadyEmptyGridCells() {
        assertEquals(0, solver.solve(new int[][]{
                {0, 0},
                {0, 0}
        }));
    }

    @Test
    void testMultipleRottenSourcesSpreadInOneMinute() {
        assertEquals(2, solver.solve(new int[][]{
                {2, 1, 2},
                {1, 1, 1},
                {2, 1, 2}
        }));
    }

    @Test
    void testFreshOrangeBlockedByEmptyCells() {
        assertEquals(-1, solver.solve(new int[][]{
                {2, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        }));
    }
}
