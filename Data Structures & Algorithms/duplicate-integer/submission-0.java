class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for (int num : nums) {
            if(intSet.contains(num)) {
                return true;
            } else {
                intSet.add(num);
            }
            
        }
        return false;
    }
}