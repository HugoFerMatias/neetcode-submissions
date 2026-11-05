class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = 0;
        boolean inSeq = false;
        if(nums.length == 1) {
            if(nums[0] == 1) return 1;
            else return 0;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                inSeq = true;
                count++;
            }
            else 
            {
                inSeq = false;
                count = 0;
            }
            if(max < count) {
                max = count;
            }
        }
        return max;
    }
}