class Solution {
    public void sortColors(int[] nums) {
        

        Map<Integer,Integer> freq = new HashMap<>();
        int len  = nums.length;

        for(int num: nums) {
            if(freq.containsKey(num)) {
                freq.put(num, freq.get(num)+1);
            } else {
                freq.put(num, 1);
            }
        }

        int[] sortedColors = new int[len];
        int numColor = 3;
        int j = 0;
        for(int i = 0; i < numColor && j < len; i++) {
            
            if(freq.containsKey(i)) {
                int freqNum = freq.get(i);
                while(freqNum > 0){
                    sortedColors[j] = i;
                    j++;
                    freqNum--;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            nums[i] = sortedColors[i];
        }       

    }
}