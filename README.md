# Kata

This repository is a structured Java DSA kata system built for test-driven practice.

Each problem lives as a pair:
- a stubbed problem class under `src/main/java`
- a JUnit 5 test class under `src/test/java`

The intended workflow is:
1. pick a kata
2. run its failing tests
3. implement the solution in the problem class
4. rerun the tests until they pass

## Project Structure

Main source packages:
- `src/main/java/kata/arrays`
- `src/main/java/kata/twopointers`
- `src/main/java/kata/slidingwindow`
- `src/main/java/kata/sorting`
- `src/main/java/kata/trees`
- `src/main/java/kata/graphs`

Test source packages:
- `src/test/java/kata/arrays`
- `src/test/java/kata/twopointers`
- `src/test/java/kata/slidingwindow`
- `src/test/java/kata/sorting`
- `src/test/java/kata/trees`
- `src/test/java/kata/graphs`
- `src/test/java/kata/utils`

Support classes:
- `kata.trees.TreeNode` for tree problems
- `kata.graphs.GraphNode` for graph problems
- `kata.utils.TestResultExtension` for test tracking
- `kata.utils.ProgressTracker` for recording solved problems

## Kata Format

Every kata follows the same rules:
- the problem class contains the full problem statement in comments
- the problem class exposes only the method signature and a dummy return
- the initial implementation is intentionally wrong so tests fail first
- every test class uses JUnit 5
- every test class is annotated with `@ExtendWith(kata.utils.TestResultExtension.class)`
- every test class includes at least 5 cases:
  normal case
  edge case
  empty input
  single element
  tricky case

This keeps the repository ready for repeated TDD practice instead of shipping completed answers.

## Current Modules

### Module 1: Arrays & Hashing
- `TwoSum`
- `ContainsDuplicate`
- `ValidAnagram`
- `IntersectionOfArrays`
- `MajorityElement`
- `ProductOfArrayExceptSelf`
- `BestTimeToBuySellStock`
- `MaximumSubarray`
- `MoveZeroes`
- `MissingNumber`
- `LongestConsecutiveSequence`

### Module 2: Two Pointers
- `ValidPalindrome`
- `TwoSumSorted`
- `RemoveDuplicatesFromSortedArray`
- `ContainerWithMostWater`
- `ThreeSum`
- `SquaresOfSortedArray`

### Module 3: Sliding Window
- `MaximumSumSubarraySizeK`
- `LongestSubstringWithoutRepeatingCharacters`
- `LongestRepeatingCharacterReplacement`
- `MinimumSizeSubarraySum`
- `PermutationInString`
- `FindAllAnagramsInString`

### Module 4: Sorting
- `BubbleSort`
- `SelectionSort`
- `InsertionSort`
- `MergeSort`
- `QuickSort`
- `SortColors`
- `KthLargestElement`

### Module 5: Trees
- `MaximumDepthBinaryTree`
- `SameTree`
- `InvertBinaryTree`
- `BinaryTreeLevelOrderTraversal`
- `DiameterOfBinaryTree`
- `BalancedBinaryTree`
- `PathSum`
- `LowestCommonAncestor`
- `ValidateBinarySearchTree`
- `KthSmallestInBST`

### Module 6: Graphs
- `NumberOfIslands`
- `FloodFill`
- `CloneGraph`
- `CourseSchedule`
- `RottingOranges`

## How To Work On A Kata

Pick a problem and implement only the corresponding class under `src/main/java`.

Examples:
- [TwoSum.java](/Users/anujtiwari/Desktop/Kata/src/main/java/kata/arrays/TwoSum.java)
- [ThreeSum.java](/Users/anujtiwari/Desktop/Kata/src/main/java/kata/twopointers/ThreeSum.java)
- [MaximumDepthBinaryTree.java](/Users/anujtiwari/Desktop/Kata/src/main/java/kata/trees/MaximumDepthBinaryTree.java)
- [CourseSchedule.java](/Users/anujtiwari/Desktop/Kata/src/main/java/kata/graphs/CourseSchedule.java)

Use the matching test as the acceptance contract:
- [TwoSumTest.java](/Users/anujtiwari/Desktop/Kata/src/test/java/kata/arrays/TwoSumTest.java)
- [ThreeSumTest.java](/Users/anujtiwari/Desktop/Kata/src/test/java/kata/twopointers/ThreeSumTest.java)
- [MaximumDepthBinaryTreeTest.java](/Users/anujtiwari/Desktop/Kata/src/test/java/kata/trees/MaximumDepthBinaryTreeTest.java)
- [CourseScheduleTest.java](/Users/anujtiwari/Desktop/Kata/src/test/java/kata/graphs/CourseScheduleTest.java)

## Test Tracking

All test classes use `kata.utils.TestResultExtension`.

That extension:
- derives the solved problem name from the test class name
- records successful runs through `kata.utils.ProgressTracker`
- appends progress entries to:
  `src/main/java/kata/progress/progress.txt`

## Build

The repository includes a Maven `pom.xml` and targets JUnit 5.

Recommended environment:
- Java 21

Typical commands:

```bash
mvn test
```

To run a single test class:

```bash
mvn -Dtest=TwoSumTest test
```

## Notes

- Solutions are intentionally not implemented by default.
- Many tests are expected to fail until each kata is solved.
- `src/test/java/kata/utils` is shared infrastructure and should generally stay stable.
