package kata.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(kata.utils.TestResultExtension.class)
class ThreeSumTest {

    ThreeSum solver = new ThreeSum();

    @Test
    void testNormalCase() {
        List<List<Integer>> result = normalize(solver.solve(new int[]{-1, 0, 1, 2, -1, -4}));
        List<List<Integer>> expected = normalize(Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        ));
        assertEquals(expected, result);
    }

    @Test
    void testEdgeCase() {
        List<List<Integer>> result = normalize(solver.solve(new int[]{0, 0, 0}));
        List<List<Integer>> expected = normalize(Collections.singletonList(Arrays.asList(0, 0, 0)));
        assertEquals(expected, result);
    }

    @Test
    void testEmptyInput() {
        assertTrue(solver.solve(new int[]{}).isEmpty());
    }

    @Test
    void testSingleElement() {
        assertTrue(solver.solve(new int[]{0}).isEmpty());
    }

    @Test
    void testTrickyCase() {
        List<List<Integer>> result = normalize(solver.solve(new int[]{-2, 0, 1, 1, 2}));
        List<List<Integer>> expected = normalize(Arrays.asList(
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1)
        ));
        assertEquals(expected, result);
    }

    private List<List<Integer>> normalize(List<List<Integer>> triplets) {
        List<List<Integer>> normalized = new ArrayList<>();
        for (List<Integer> triplet : triplets) {
            List<Integer> copy = new ArrayList<>(triplet);
            copy.sort(Integer::compareTo);
            normalized.add(copy);
        }
        Collections.sort(normalized, (a, b) -> compareTriplets(a, b));
        return normalized;
    }

    private int compareTriplets(List<Integer> a, List<Integer> b) {
        int size = Math.min(a.size(), b.size());
        for (int i = 0; i < size; i++) {
            int cmp = Integer.compare(a.get(i), b.get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return Integer.compare(a.size(), b.size());
    }
}
