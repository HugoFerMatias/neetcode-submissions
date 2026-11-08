/*
x % k == 0
sum - k % k == 0

k=5
[4,5,0,-2,-3,1]
[0,1,1,0]
*/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer, Integer> prefixDivs = new HashMap<>();

        int sum = 0;
        int count = 0;
        int remainder = 0;
        prefixDivs.put(0, 1);
        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];
            int target = sum % k;

            if(prefixDivs.containsKey(target)) {
                count += prefixDivs.get(target); 
            }

            prefixDivs.put(target, prefixDivs.getOrDefault(target, 0) + 1);

        }

        return count;

    }
}