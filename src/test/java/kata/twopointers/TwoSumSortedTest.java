package kata.twopointers;

import kata.utils.TestResultExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestResultExtension.class)
class TwoSumSortedTest {

    TwoSumSorted solver = new TwoSumSorted();

    @Test
    void testBasicCase() {
        assertArrayEquals(new int[]{1,2}, solver.solve(new int[]{2,7,11,15}, 9));
    }

    @Test
    void testAnotherCase() {
        assertArrayEquals(new int[]{1,3}, solver.solve(new int[]{2,3,4}, 6));
    }

    @Test
    void testNegativeNumbers() {
        assertArrayEquals(new int[]{1,2}, solver.solve(new int[]{-1,0}, -1));
    }

    @Test
    void testNoSolution() {
        assertArrayEquals(new int[]{-1,-1}, solver.solve(new int[]{1,2,3}, 10));
    }
}
