class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        
        int curr = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                curr += nums[j];
                if(curr == k) {
                    count++;
                }
            }
            curr = 0;
        }

        return count;
    }
}