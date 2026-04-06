package kata.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class FindAllAnagramsInStringTest {

    private final FindAllAnagramsInString solver = new FindAllAnagramsInString();

    @Test
    void testNormalCase() {
        assertEquals(Arrays.asList(0, 6), solver.solve("cbaebabacd", "abc"));
    }

    @Test
    void testEdgeCase() {
        assertEquals(Arrays.asList(0, 1, 2), solver.solve("abab", "ab"));
    }

    @Test
    void testEmptyInput() {
        assertEquals(Arrays.<Integer>asList(), solver.solve("", "a"));
    }

    @Test
    void testSingleElement() {
        assertEquals(Arrays.asList(0), solver.solve("a", "a"));
    }

    @Test
    void testTrickyCase() {
        List<Integer> result = solver.solve("baa", "aa");
        assertEquals(Arrays.asList(1), result);
    }
}
