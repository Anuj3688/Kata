package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MoveZeroesTest {

    MoveZeroes solver = new MoveZeroes();

    @Test
    void testNormalCase() {
        int[] nums = {0, 1, 0, 3, 12};
        solver.solve(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void testEdgeCase() {
        int[] nums = {0, 0, 0};
        solver.solve(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test
    void testEmptyInput() {
        int[] nums = {};
        solver.solve(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        solver.solve(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void testTrickyCase() {
        int[] nums = {4, 0, 5, 0, 0, 3, 0, 1};
        solver.solve(nums);
        assertArrayEquals(new int[]{4, 5, 3, 1, 0, 0, 0, 0}, nums);
    }
}
