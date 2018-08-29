package loucianus.leetcode;

/**
 * <p>Given a non-empty array of integers, 
 * every element appears twice except for one. 
 * Find that single one.</p>
 * 
 * <p>Notes:</p>
 * <p>In-space : without using extra memory.</p>
 * <p>In-time  : a liner runtime complexity.</p>
 * 
 * @author Loucianus
 * @version 1.0
 */
public class SingleNumber {

    /**
     * Find that single one.
     * 
     * A number XOR itself cloud get ZERO.
     * There must is the single one number in that array.
     * So we can nums[0] XOR nums[1] XOR ...XOR nums[length - 1],then we can get the single one;
     * 
     * @param nums the array :{@code nums} of integer that we need to find the single number.
     * @return that single number in the array :{@code nums}
     */
    public int singleNumber(int[] nums) {

        int single = 0;

        for (int num : nums) {
            single = single ^ num;
        }
        
        return single;
    }
}