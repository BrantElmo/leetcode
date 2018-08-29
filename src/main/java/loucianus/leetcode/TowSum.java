package loucianus.leetcode;

import java.util.HashMap;

/**
 * <p>Given an array of integers, return indices of the two numbers
 * such that add up to a specific target.</p>
 * 
 * <p>You may assume that each input would have exactly on solution,
 * and you may not use the same element twice</p>
 * 
 * @author Loucianus
 * @version 1.0
 */
public class TowSum {

    /**
     * Got the indices of the array {@code nums}
     * 
     * @param nums
     * @param targer 
     */
    public int[] towSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
             
            map.put(nums[i], i);
        }

        return result;
    }
}