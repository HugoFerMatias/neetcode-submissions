class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int n = nums.length;
        if(n == 1 || n == 0) {
            return false;
        }
        int j = 0;
        for(int i = 0; i < n; i++) {
            j = i + 1;
            while(j < n) {
                if (nums[i] == nums[j]) {
                     return true;
                }
                j++;
            }
        }
        return false;
    }
}