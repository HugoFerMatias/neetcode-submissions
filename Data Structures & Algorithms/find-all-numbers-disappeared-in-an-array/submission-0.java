/*

*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>(nums.length);

        for(int k = 0; k < nums.length; k++) {
            result.add(-1);
        }

        for(int i = 0; i < nums.length; i++) {
            result.set(nums[i] - 1, nums[i]);
        }
        
        for(int j = 0; j < nums.length; j++) {
            
            if(result.get(j) != -1) {
                result.set(j, -1);
            } else result.set(j, j + 1);
        }

        result.removeIf(n -> n == -1);

        return result;
    }
}