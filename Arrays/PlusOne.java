/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * link：https://leetcode-cn.com/problems/plus-one
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int carry = (digits[size - 1] + 1) / 10;
        digits[ size - 1] = (digits[size - 1] + 1) % 10;

        for (int i = size - 2; i >= 0; i--) {
            int ele = digits[i];
            digits[i] = (ele + carry) % 10;
            carry = ( ele + carry) / 10;
        }
        if (carry != 0) {
            return newArray(digits, carry, size);
        }
        return digits;
    }

    public int[] newArray(int[] digits, int carry, int size) {
        int[] res = new int[size + 1];
        res[0] = carry;
        for (int i = 1; i < size + 1; i++) {
            res[i] = digits[i - 1];
        }
        return res;
    }
}
