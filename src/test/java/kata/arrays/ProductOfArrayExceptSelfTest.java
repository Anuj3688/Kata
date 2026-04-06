package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

    @Test
    void testNormalCase() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solver.solve(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testEdgeCase() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solver.solve(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    void testEmptyInput() {
        assertArrayEquals(new int[]{}, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{1}, solver.solve(new int[]{5}));
    }

    @Test
    void testTrickyCase() {
        assertArrayEquals(new int[]{0, 8, 0}, solver.solve(new int[]{4, 0, 2}));
    }
}
