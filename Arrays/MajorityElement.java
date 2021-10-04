public class MajorityElement{
    public int majorityElement(int[] nums) {
        Integer res = nums[0];
        int count = 1;
        for (int i = 1;i < nums.length; i++) {
            if (nums[i] == res) {
                count++;
            } else if(--count == 0) {
                res = nums[i];
                count = 1;
            }
        }
        return res;
    }
}