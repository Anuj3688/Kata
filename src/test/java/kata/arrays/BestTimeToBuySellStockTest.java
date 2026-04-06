package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class BestTimeToBuySellStockTest {

    BestTimeToBuySellStock solver = new BestTimeToBuySellStock();

    @Test
    void testNormalCase() {
        assertEquals(5, solver.solve(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(0, solver.solve(new int[]{7, 6, 4, 3, 1}));
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
        assertEquals(2, solver.solve(new int[]{2, 4, 1}));
    }
}
