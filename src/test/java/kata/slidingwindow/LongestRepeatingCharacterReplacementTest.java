package kata.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement solver =
            new LongestRepeatingCharacterReplacement();

    @Test
    void testNormalCase() {
        assertEquals(4, solver.solve("ABAB", 2));
    }

    @Test
    void testEdgeCase() {
        assertEquals(4, solver.solve("AABABBA", 1));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve("", 2));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solver.solve("A", 0));
    }

    @Test
    void testTrickyCase() {
        assertEquals(4, solver.solve("AAAA", 2));
    }
}
