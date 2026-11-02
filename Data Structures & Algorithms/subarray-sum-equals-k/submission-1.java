class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefix = new HashMap<>();

       
        int sum = 0;
        int count = 0;
        int prefixSum = 0;
        prefix.put(prefixSum, 1);
        for(int i = 0; i < nums.length; i++) {
            
            prefixSum += nums[i];
            sum = prefixSum - k;

            if(prefix.containsKey(sum)) {
                count += prefix.get(sum);
            }

            if(prefix.containsKey(prefixSum)) {
                    int freq = prefix.get(prefixSum);
                    prefix.put(prefixSum, freq + 1);
            } else {
                    prefix.put(prefixSum, 1);
            }
        }
        return count;
    }
}