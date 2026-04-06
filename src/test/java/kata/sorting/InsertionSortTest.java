package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class InsertionSortTest {

    private final InsertionSort solver = new InsertionSort();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{5, 6, 11, 12, 13}, solver.solve(new int[]{12, 11, 13, 5, 6}));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{1, 1, 2, 2}, solver.solve(new int[]{2, 1, 2, 1}));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{9}, solver.solve(new int[]{9}));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{-3, -1, 4, 7}, solver.solve(new int[]{7, -1, 4, -3}));
    }
}
