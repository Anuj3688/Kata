package kata.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence solver = new LongestConsecutiveSequence();

    @Test
    void testNormalCase() {
        assertEquals(4, solver.solve(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void testEdgeCase() {
        assertEquals(9, solver.solve(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solver.solve(new int[]{42}));
    }

    @Test
    void testTrickyCase() {
        assertEquals(3, solver.solve(new int[]{1, 2, 0, 1}));
    }
}
