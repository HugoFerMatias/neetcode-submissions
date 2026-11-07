/*
[2,-1,1,2]
sum - x = k <=> sum - k = x
[2,1,2,4]
*/

class Solution {
    public int subarraySum(int[] nums, int k) {

       HashMap<Integer, Integer> prefixSums = new HashMap<>();
       
       int sum = 0;
       int count = 0;
       prefixSums.put(0, 1); 
       for(int i = 0; i < nums.length; i++) {

        sum += nums[i];
        int target = sum - k;
        if(prefixSums.containsKey(target)) {
            count += prefixSums.get(target);
        }
        prefixSums.put(sum, prefixSums.getOrDefault(sum , 0) + 1); 
       }

       return count;

    }
}

/*
[-1,-1,1] count = 2 sum = -2
[0,1 - -1,1 - -2,1]
*/