package loucianus.leetcode;

/**
 * <p>Given an array {@code nums}, write a function to move 
 * all {@code 0} to the end of it while maintaining the
 * relative order of the non-zero elements.</p>
 * 
 * @author Loucianus 
 * @version 1.0
 */
public class MoveZeros {

    /**
     * Move zeros
     * 
     * Use the double point to move the non-zero elemnet,
     * and fill with zero to the end in of array. 
     * 
     * @param nums An array needed to move zeros.
     */
    public void moveZeros(int[] nums) {

        if (nums.length == 1 || nums == null) return;
        
        int index = 0;
        
        for (int num : nums) if (num != 0) nums[index++] = num;
            
        while (index < nums.length) nums[index++] = 0;

    }
}