class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        int bucketsLength = nums.length + 1;
        Map<Integer,Integer> counter = new HashMap<>();
        List<Integer>[] buckets = new List[bucketsLength];

        for(int num: nums){
            
            if(!counter.containsKey(num)){
                counter.put(num,1);
            } else {
                counter.put(num, counter.get(num) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: counter.entrySet()) {
            
            int freq = entry.getValue();
            
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            } 
            buckets[freq].add(entry.getKey());
        }

        int[] result = new int[k];
        int i = 0;
        for(int freq = bucketsLength - 1; freq > 0 && i < k; freq--){

            if(buckets[freq] != null) {
                for(int num: buckets[freq]){
                    result[i] = num;
                    i++;

                    if(i == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
