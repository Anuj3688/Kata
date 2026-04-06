package kata.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class PermutationInStringTest {

    private final PermutationInString solver = new PermutationInString();

    @Test
    void testNormalCase() {
        assertTrue(solver.solve("ab", "eidbaooo"));
    }

    @Test
    void testEdgeCase() {
        assertFalse(solver.solve("ab", "eidboaoo"));
    }

    @Test
    void testEmptyInput() {
        assertFalse(solver.solve("", ""));
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve("a", "a"));
    }

    @Test
    void testTrickyCase() {
        assertTrue(solver.solve("adc", "dcda"));
    }
}
