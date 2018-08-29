package loucianus.leetcode;

/**
 * <p>Give an array ,rotate the array to the right by {@code int k} steps,
 * where {@code k} is non-nagtive</p>
 * 
 * @author Loucianus
 * @version 1.0
 */
public class RotateArray {
    
    /**
     * @param nums the array that need to rotate
     * @param k the steps, {@codek k} is non-nagtive
     */
    public void rotate(int[] nums, int k) {
        // Get a integer is k moded nums.length
        int modK = k % nums.length;
        
        if(nums.length == 0) {
            return;
        }

        metathesis(nums, nums.length - modK, nums.length - 1);
        metathesis(nums, 0, nums.length - modK -1);
        metathesis(nums, 0, nums.length - 1);
    }
    
    /**
     * Permutate the Array
     * permutate an array {@code int[] nums} 
     * from the beginning index {@code int begin} to the ending index {@code int end}</p>
     * 
     * @param nums the array which all elements is {@code Integer} number in it
     * @param begin the beginning index of the array
     * @param end the ending index of the array
     */
    private void metathesis(int[] nums, int begin, int end) {
        while(begin < end) {
            nums[begin] = nums[begin] ^ nums[end];
            nums[end] = nums[begin] ^ nums[end];
            nums[begin] = nums[begin] ^ nums[end];
            begin++;
            end--;
        }
    }
}
