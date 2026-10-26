class Solution {
    public int majorityElement(int[] nums) {
        

        Map<Integer, Integer> freq = new HashMap<>();
        int max = 1;
        int maxElement = 0;

        for(int num: nums) {
            if(freq.containsKey(num)) {
               int newFreq = freq.get(num)+1;
               freq.put(num, newFreq);
               if(newFreq > max) {
                max = newFreq;
                maxElement = num;
                }
            } else {
                freq.put(num,1);
                if(max == 1) {
                    maxElement = num;
                }
            }
        }

        return maxElement;
    }
}