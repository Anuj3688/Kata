package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class SelectionSortTest {

    private final SelectionSort solver = new SelectionSort();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, solver.solve(new int[]{64, 25, 12, 22, 11}));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{1, 2, 3}, solver.solve(new int[]{3, 2, 1}));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{5}, solver.solve(new int[]{5}));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{-5, -1, 2, 2}, solver.solve(new int[]{2, -1, 2, -5}));
    }
}
