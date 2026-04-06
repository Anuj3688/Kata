package kata.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MinimumSizeSubarraySumTest {

    private final MinimumSizeSubarraySum solver = new MinimumSizeSubarraySum();

    @Test
    void testNormalCase() {
        assertEquals(2, solver.solve(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(1, solver.solve(4, new int[]{1, 4, 4}));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(5, new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solver.solve(5, new int[]{5}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(3, solver.solve(11, new int[]{1, 2, 3, 4, 5}));
    }
}
