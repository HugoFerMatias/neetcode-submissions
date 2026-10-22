class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> counter = new HashMap<>();

        for(int num: nums) {
            
            if(!counter.containsKey(num)) {
                counter.put(num,1);
            } else {
                counter.put(num, counter.get(num) + 1);
            }
        }

        List<Map.Entry<Integer,Integer>> aux = new ArrayList<>(counter.entrySet()); 
        aux.sort((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        int[] result = new int[k];
        int j = aux.size()-1;
        int i = 0;
        while(k > i) {
            result[i] = aux.get(j).getKey();
            j--;
            i++;
        }

        return result;
    }
}
