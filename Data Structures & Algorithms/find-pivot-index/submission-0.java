class Solution {
    public int pivotIndex(int[] nums) {
        
        int total = 0;
        for(int num: nums) {
            total += num;
        }

        int curr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(curr == (total - curr - nums[i])) return i;
            curr += nums[i];
        }
        return -1;
    }
}