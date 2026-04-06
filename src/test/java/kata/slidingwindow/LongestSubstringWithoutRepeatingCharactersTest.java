package kata.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters solver =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void testNormalCase() {
        assertEquals(3, solver.solve("abcabcbb"));
    }

    @Test
    void testEdgeCase() {
        assertEquals(1, solver.solve("bbbbb"));
    }

    @Test
    void testEmptyInput() {
        assertEquals(0, solver.solve(""));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solver.solve("a"));
    }

    @Test
    void testTrickyCase() {
        assertEquals(3, solver.solve("pwwkew"));
    }
}
