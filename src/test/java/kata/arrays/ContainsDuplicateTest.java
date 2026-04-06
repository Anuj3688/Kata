package kata.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate solver = new ContainsDuplicate();

    @Test
    void testHasDuplicate() {
        assertTrue(solver.solve(new int[]{1,2,3,1}));
    }

    @Test
    void testNoDuplicate() {
        assertFalse(solver.solve(new int[]{1,2,3,4}));
    }

    @Test
    void testSingleElement() {
        assertFalse(solver.solve(new int[]{1}));
    }

    @Test
    void testEmptyArray() {
        assertFalse(solver.solve(new int[]{}));
    }

    @Test
    void testAllSame() {
        assertTrue(solver.solve(new int[]{5,5,5,5}));
    }
}