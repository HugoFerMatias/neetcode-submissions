class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            while(i < nums.length && nums[i] == 1) {
                count++;
                i++;
            }
            if(count > max) max = count;
            count = 0;
            }
        return max;
        }
}
