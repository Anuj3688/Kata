package kata.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();

    @Test
    void testNormalCase() {
        int[] nums = {1, 1, 2};
        int k = solver.solve(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[]{1, 2}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testEdgeCase() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solver.solve(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testEmptyInput() {
        int[] nums = {};
        int k = solver.solve(nums);
        assertEquals(0, k);
        assertArrayEquals(new int[]{}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testSingleElement() {
        int[] nums = {7};
        int k = solver.solve(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[]{7}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void testTrickyCase() {
        int[] nums = {1, 1, 1, 1};
        int k = solver.solve(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[]{1}, java.util.Arrays.copyOf(nums, k));
    }
}
