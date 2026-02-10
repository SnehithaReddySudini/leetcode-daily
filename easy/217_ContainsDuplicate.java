/*
 LeetCode 217: Contains Duplicate
 Difficulty: Easy
 Date: 2026-02-10
*/

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
