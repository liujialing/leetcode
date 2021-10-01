/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 *
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 *
 * link：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 */
public class SortedArrayToBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return process(nums, 0, nums.length-1);
    }

    public TreeNode process(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = process(nums, 0, mid - 1);
        root.right = process(nums, mid + 1, end);

        return root;
    }
}