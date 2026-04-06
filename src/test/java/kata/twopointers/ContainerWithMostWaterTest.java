package kata.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class ContainerWithMostWaterTest {

    ContainerWithMostWater solver = new ContainerWithMostWater();

    @Test
    void testNormalCase() {
        assertEquals(49, solver.solve(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(1, solver.solve(new int[]{1, 1}));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, solver.solve(new int[]{5}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(16, solver.solve(new int[]{4, 3, 2, 1, 4}));
    }
}
