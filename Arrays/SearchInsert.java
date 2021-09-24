/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * link：https://leetcode-cn.com/problems/search-insert-position
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length && nums[i] < target ; i++) {}
        return i;
    }
}
