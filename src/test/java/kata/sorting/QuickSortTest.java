package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class QuickSortTest {

    private final QuickSort solver = new QuickSort();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, solver.solve(new int[]{10, 7, 8, 9, 1, 5}, 0, 5));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{1, 2, 3}, solver.solve(new int[]{3, 2, 1}, 0, 2));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}, 0, -1));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{6}, solver.solve(new int[]{6}, 0, 0));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{-4, -1, 2, 2, 9}, solver.solve(new int[]{2, -1, 9, 2, -4}, 0, 4));
    }
}
