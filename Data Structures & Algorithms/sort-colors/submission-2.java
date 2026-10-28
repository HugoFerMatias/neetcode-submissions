//[0,1,2,0,1]
// i   j 
class Solution {
    public void sortColors(int[] nums) {

        int[] freq = new int[3];
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            freq[nums[i]] += 1;
        }
        
        int j = 0;
        for(int i = 0; i < 3; i++) {
            
            int count = 0;
            while(count < freq[i]) {
                nums[j] = i;
                count++;
                j++;    
            }
        }        
    }
}