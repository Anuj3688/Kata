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
}
