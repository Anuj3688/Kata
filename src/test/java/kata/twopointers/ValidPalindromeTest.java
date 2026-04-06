package kata.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    ValidPalindrome solver = new ValidPalindrome();

    @Test
    void testValidPalindrome() {
        assertTrue(solver.solve("A man, a plan, a canal: Panama"));
    }

    @Test
    void testInvalidPalindrome() {
        assertFalse(solver.solve("race a car"));
    }

    @Test
    void testEmptyString() {
        assertTrue(solver.solve(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(solver.solve("a"));
    }

    @Test
    void testSpecialCharacters() {
        assertTrue(solver.solve("!!"));
    }
}