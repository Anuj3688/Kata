package kata.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Contains Duplicate
 *
 * Given an integer array nums, return true if any value appears
 * at least twice in the array, and return false if every element is distinct.
 *
 * Example:
 * Input: nums = [1,2,3,1]
 * Output: true
 */
public class ContainsDuplicate {

//    public boolean solve(int[] nums) {
//        // TODO: Implement this
//        for (int i =0 ; i<nums.length-1 ; i++){
//            for (int j = i+1; j <nums.length ; j++){
//                if (nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public boolean solve(int[] nums) {
        // TODO: Implement this
        Set<Integer> ans = new HashSet<>();
        for (int i =0 ; i<nums.length ; i++){
            if (ans.contains(nums[i])) {
                return true;
            }
            ans.add(nums[i]);
        }
        return false;
    }
}