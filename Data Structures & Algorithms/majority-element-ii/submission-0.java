
/*
Freq count com hash map onde key = num e value = freq 
Comparar value com n/3
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityElements = new ArrayList<>();

        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            if(freq.containsKey(num)) {
                int numFreq = freq.get(num);
                freq.put(num, numFreq + 1);
            } else {
                freq.put(num,1);
            }
        }

        int third = (nums.length)/3;

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if(entry.getValue() > third) {
                majorityElements.add(entry.getKey());
            }
        }
        return majorityElements;
    }
}