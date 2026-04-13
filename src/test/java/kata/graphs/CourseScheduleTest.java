package kata.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class CourseScheduleTest {

    private final CourseSchedule solver = new CourseSchedule();

    @Test
    void testNormalCase() {
        assertTrue(solver.solve(2, new int[][]{{1, 0}}));
    }

    @Test
    void testEdgeCase() {
        assertFalse(solver.solve(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void testEmptyInput() {
        assertTrue(solver.solve(0, new int[][]{}));
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve(1, new int[][]{}));
    }

    @Test
    void testTrickyCase() {
        assertTrue(solver.solve(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }

    @Test
    void testLongerCycle() {
        assertFalse(solver.solve(3, new int[][]{{1, 0}, {2, 1}, {0, 2}}));
    }

    @Test
    void testDisconnectedComponents() {
        assertTrue(solver.solve(6, new int[][]{{1, 0}, {2, 1}, {4, 3}}));
    }

    @Test
    void testSelfDependency() {
        assertFalse(solver.solve(2, new int[][]{{1, 1}}));
    }

    @Test
    void testIndependentCoursesWithOneChain() {
        assertTrue(solver.solve(5, new int[][]{{2, 1}, {1, 0}}));
    }

    @Test
    void testDiamondDependencyStillPossible() {
        assertTrue(solver.solve(5, new int[][]{{2, 0}, {2, 1}, {3, 2}, {4, 2}}));
    }

    @Test
    void testCycleInsideDisconnectedGraph() {
        assertFalse(solver.solve(6, new int[][]{{1, 0}, {2, 1}, {0, 2}, {4, 3}}));
    }
}
