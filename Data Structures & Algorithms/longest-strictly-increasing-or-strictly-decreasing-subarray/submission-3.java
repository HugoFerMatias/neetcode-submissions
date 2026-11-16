/*
Iterar pelo array
comparar atual com anterior e verificar uma flag que indica se vem 
de uma sequencia positiva ou negativa.
*/

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int isIncreasing = 0;
        int count = 1;
        int max = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                if(isIncreasing != 1) {
                    max = Math.max(count,max);
                    count = 1;
                }
                count++;
                isIncreasing = 1;
            } else if(nums[i] < nums[i-1]) {
                if(isIncreasing != -1) {
                    max = Math.max(count,max);
                    count = 1;
                }
                count++;
                isIncreasing = -1;
            }

            else {
                max = Math.max(count,max);
                count = 1;
                isIncreasing = 0;
            }
        }
        return Math.max(count,max);
    }
}