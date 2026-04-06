package kata.arrays;

import kata.utils.TestResultExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestResultExtension.class)
class TwoSumTest {

    TwoSum solver = new TwoSum();

    @Test
    void testBasicCase() {
        int[] result = solver.solve(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    void testDuplicateNumbers() {
        int[] result = solver.solve(new int[]{3,3}, 6);
        assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    void testNoSolution() {
        int[] result = solver.solve(new int[]{1,2,3}, 7);
        assertArrayEquals(new int[]{-1,-1}, result);
    }

    @Test
    void testSingleElement() {
        int[] result = solver.solve(new int[]{5}, 5);
        assertArrayEquals(new int[]{-1,-1}, result);
    }

    @Test
    void testEmptyArray() {
        int[] result = solver.solve(new int[]{}, 5);
        assertArrayEquals(new int[]{-1,-1}, result);
    }
}
