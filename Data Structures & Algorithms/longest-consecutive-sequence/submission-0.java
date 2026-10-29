
/*
criar counter que conta a sequencia atual
criar max que guarda a seq maxima atual
nums num hashset -> verificar se num + 1 existe no set 
se sim counter++
se nao comparar counter com max se max < counter entao max = counter
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();

        int count = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i])) {
                seen.add(nums[i]);
            }
        }

    
        for(int j = 0; j < nums.length; j++) {
            int k = nums[j] - 1;
            if(!seen.contains(k)) {
                k++;
                while(seen.contains(k)) {
                    count++;
                    k++; 
                }
                if(max < count) {
                    max = count;
                }
            }
            count = 0;
        }
        

        return max;

    }
}
