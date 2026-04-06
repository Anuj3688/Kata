package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class SortColorsTest {

    private final SortColors solver = new SortColors();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, solver.solve(new int[]{2, 0, 2, 1, 1, 0}));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{0, 1, 2}, solver.solve(new int[]{2, 1, 0}));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{1}, solver.solve(new int[]{1}));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 2, 2}, solver.solve(new int[]{1, 0, 2, 1, 0, 2, 0}));
    }
}
