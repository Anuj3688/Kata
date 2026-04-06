package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MissingNumberTest {

    MissingNumber solver = new MissingNumber();

    @Test
    void testNormalCase() {
        assertEquals(2, solver.solve(new int[]{3, 0, 1}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(2, solver.solve(new int[]{0, 1}));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, solver.solve(new int[]{1}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(8, solver.solve(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
