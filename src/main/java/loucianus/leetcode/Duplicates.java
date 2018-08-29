package loucianus.leetcode;

import java.util.HashSet;

/**
 * <p>Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.</p>
 * 
 * @author Loucianus
 * @version 1.0
 */
public class Duplicates {

    /**
     * <p>find the duplicate(s) from the {@code nums}</p>
     * 
     * @param nums the array input
     * @return if contains the duplicate(s), return {@code true}, otherwise {@code false} 
     */
    public boolean containsDuplicatebyHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}