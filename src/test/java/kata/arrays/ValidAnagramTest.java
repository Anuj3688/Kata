package kata.arrays;

import kata.utils.TestResultExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestResultExtension.class)
class ValidAnagramTest {

    ValidAnagram solver = new ValidAnagram();

    @Test
    void testValidAnagram() {
        assertTrue(solver.solve("anagram", "nagaram"));
    }

    @Test
    void testInvalidAnagram() {
        assertFalse(solver.solve("rat", "car"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(solver.solve("a", "ab"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(solver.solve("", ""));
    }

    @Test
    void testCaseSensitive() {
        assertFalse(solver.solve("a", "A"));
    }
}
