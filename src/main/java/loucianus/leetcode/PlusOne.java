package loucianus.leetcode;

/**
 * <p>Given a non-empty array of digits representing 
 * a non-nagetive integer, plus one to the integer.</p>
 * 
 * <p>The digits are stored such that the most significant 
 * digit is at the head of the list, and each element 
 * in array.</p>
 * 
 * @author Loucianus
 * @version 1.0
 */
public class PlusOne {

    /**
     * Plus one.
     * 
     * @param {@code digits} The array of digits.
     * @return A number composed of the figure in {@code digits} added one. 
     */
    public int[] plusOne(int[] digits) {
        
        for(int i = digits.length - 1; i > -1; i--) {
            digits[i] = (digits[i] == 9 ? 0 : digits[i] + 1);
            if (digits[i] != 0) break;
        }

        if(digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}