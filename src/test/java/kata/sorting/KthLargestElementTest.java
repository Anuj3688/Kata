package kata.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class KthLargestElementTest {

    private final KthLargestElement solver = new KthLargestElement();

    @Test
    void testNormalCase() {
        assertEquals(5, solver.solve(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void testEdgeCase() {
        assertEquals(4, solver.solve(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void testEmptyInput() {
        assertEquals(-1, solver.solve(new int[]{}, 1));
    }

    @Test
    void testSingleElement() {
        assertEquals(9, solver.solve(new int[]{9}, 1));
    }

    @Test
    void testTrickyCase() {
        assertEquals(2, solver.solve(new int[]{2, 1, 2, 1, 2}, 3));
    }
}
