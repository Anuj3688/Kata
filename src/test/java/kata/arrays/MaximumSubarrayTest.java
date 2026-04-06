package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MaximumSubarrayTest {

    MaximumSubarray solver = new MaximumSubarray();

    @Test
    void testNormalCase() {
        assertEquals(6, solver.solve(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(-1, solver.solve(new int[]{-2, -3, -1, -5}));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solver.solve(new int[]{1}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(23, solver.solve(new int[]{5, 4, -1, 7, 8}));
    }
}
