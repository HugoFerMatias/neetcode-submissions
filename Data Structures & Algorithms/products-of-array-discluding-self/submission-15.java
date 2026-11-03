class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] result = new int[len];

        int prefix = 1;
        result[0] = 1;
        for(int i = 0; i < len - 1; i++) {
            prefix *= nums[i];
            result[i+1] = prefix;
        }

        int postfix = 1;
        for(int j = len - 1; j > 0; j--) {
            postfix *= nums[j];
            result[j-1] *= postfix;
        }

        return result;
    }
}  

/*
[3,2,4,2]

[3,6,24,48]  - prefix
[48,16,8,2] - postfix

[16,24,12,24]
*/
