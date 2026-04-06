package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class BubbleSortTest {

    private final BubbleSort solver = new BubbleSort();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, solver.solve(new int[]{5, 1, 4, 2, 8}));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{1, 2, 3}, solver.solve(new int[]{1, 2, 3}));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{7}, solver.solve(new int[]{7}));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{-2, -1, 0, 3, 3}, solver.solve(new int[]{3, -1, 0, 3, -2}));
    }
}
