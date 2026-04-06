package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class MajorityElementTest {

    MajorityElement solver = new MajorityElement();

    @Test
    void testNormalCase() {
        assertEquals(3, solver.solve(new int[]{3, 2, 3}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(2, solver.solve(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void testEmptyInput() {
        assertEquals(-1, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(7, solver.solve(new int[]{7}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(-1, solver.solve(new int[]{1, 2, 3, 4}));
    }
}
