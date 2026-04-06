package kata.arrays;

import kata.utils.TestResultExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestResultExtension.class)
class IntersectionOfArraysTest {

    IntersectionOfArrays solver = new IntersectionOfArrays();

    @Test
    void testBasicCase() {
        int[] result = solver.solve(new int[]{1,2,2,1}, new int[]{2,2});
        Arrays.sort(result);
        assertArrayEquals(new int[]{2}, result);
    }

    @Test
    void testMultipleCommon() {
        int[] result = solver.solve(new int[]{1,2,3}, new int[]{2,3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{2,3}, result);
    }

    @Test
    void testNoCommon() {
        int[] result = solver.solve(new int[]{1,2}, new int[]{3,4});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testEmptyArray() {
        int[] result = solver.solve(new int[]{}, new int[]{1,2});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testDuplicatesHandled() {
        int[] result = solver.solve(new int[]{4,4,4}, new int[]{4,4});
        assertArrayEquals(new int[]{4}, result);
    }
}
