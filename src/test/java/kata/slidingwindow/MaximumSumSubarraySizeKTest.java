package kata.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MaximumSumSubarraySizeKTest {

    private final MaximumSumSubarraySizeK solver = new MaximumSumSubarraySizeK();

    @Test
    void testNormalCase() {
        assertEquals(9, solver.solve(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    @Test
    void testEdgeCase() {
        assertEquals(7, solver.solve(new int[]{2, 3, 4, 1, 5}, 2));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new int[]{}, 3));
    }

    @Test
    void testSingleElement() {
        assertEquals(5, solver.solve(new int[]{5}, 1));
    }

    @Test
    void testTrickyCase() {
        assertEquals(-2, solver.solve(new int[]{-4, -2, -7, -3}, 1));
    }
}
