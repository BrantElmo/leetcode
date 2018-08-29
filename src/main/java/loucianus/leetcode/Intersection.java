package loucianus.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p>Given two arrays, write a function to compute their intersection.</p>
 * 
 * @author Loucianus
 * @version 1.0
 */
public class Intersection {

    /**
     * Get the intersection array of {@code Integer}.
     * 
     * @param nums1 the first array of {@code Integer}.
     * @param nums2 the second array of {@code Integer}.
     * @return return an array that is the intersection 
     * of the arrays: {@code nums1} and {@code nums2}.
     */
    public int[] interset(int[] nums1, int[] nums2) {
        // if the array is empty, return null.
        if (nums1.length == 0 || nums2.length == 0) return null;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            // Determine wether the num is in the array nums1 or not.
            // Map uses the method containsKey() that determine 
            // wether the key is in the map 
            // or not rather than the method get(key).
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                list.add(num);
            }
        }

        int[] nums = new int[list.size()];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        } 

        return nums;
    }
}