import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * link：https://leetcode-cn.com/problems/two-sum
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> eleMap = new HashMap();
        for (int i = 0 ;i < nums.length; i++) {
            eleMap.put(nums[i], i);
        }

        for (int i = 0 ;i < nums.length; i++) {
            Integer otherIndex = eleMap.get(target - nums[i]);
            if (otherIndex != null && otherIndex != i) {
                return new int[] {i, otherIndex};
            }
        }
        return new int[]{-1, -1};
    }
}
