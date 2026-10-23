class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /* Mapa onde key = valor do numero
        e value = posicao do numero no array original
        */
        Map<Integer, Integer> posNums = new HashMap<>();
        posNums.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++) {
            int needs = target - nums[i];
            if(posNums.containsKey(needs)) {
                int high = 0;
                int low = 0;
                if(posNums.get(needs) > i) {
                    high = posNums.get(needs);
                    low = i;
                } else {
                    high = i;
                    low = posNums.get(needs);
                }
                return new int[]{low, high};
            }
            posNums.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
