package kata.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class SquaresOfSortedArrayTest {

    SquaresOfSortedArray solver = new SquaresOfSortedArray();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solver.solve(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solver.solve(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{25}, solver.solve(new int[]{-5}));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{1, 4, 9, 25}, solver.solve(new int[]{-5, -2, -1, 3}));
    }
}
