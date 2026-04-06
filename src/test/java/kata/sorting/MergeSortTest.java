package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MergeSortTest {

    private final MergeSort solver = new MergeSort();

    @Test
    void testNormalCase() {
        assertArrayEquals(
                new int[]{3, 9, 10, 27, 38, 43, 82},
                solver.solve(new int[]{38, 27, 43, 3, 9, 82, 10}, 0, 6)
        );
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{1, 2}, solver.solve(new int[]{2, 1}, 0, 1));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}, 0, -1));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{4}, solver.solve(new int[]{4}, 0, 0));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{-2, -1, 0, 5, 5}, solver.solve(new int[]{5, -1, 0, 5, -2}, 0, 4));
    }
}
