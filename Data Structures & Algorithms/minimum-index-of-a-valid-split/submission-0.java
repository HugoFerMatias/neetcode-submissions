/*
[2,1,3,1,1,1,7,1,2,1]

Hashmap que guarda a frequência com que o valor dominante aparece até 
à posição "i"
- Verificar se (length de 0 até i) / 2  =< freq de dominante até i
- Se sim, verificar se (length de i até length total) / 2 =<  freq total do dominante - freq gasta na verificação total)  
*/

class Solution {
    public int minimumIndex(List<Integer> nums) {
        
        // Map com freq e posicao
        Map<Integer, Integer> freqPos = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();

        int max = 0;
        int dominant = nums.getFirst();
        for(int i = 1; i < nums.size(); i++){
            if(freq.containsKey(nums.get(i))) {
                freq.put(nums.get(i), freq.get(nums.get(i)) + 1);
                if(max < freq.get(nums.get(i))) {
                    max = freq.get(nums.get(i));
                    dominant = nums.get(i);
                }
            } else {
               freq.put(nums.get(i), 1); 
            }
        }

        System.out.println("DOMINANTE "  + dominant);

        int len = nums.size();
        int freqDominant = 0;
        for(int j = 0; j < len; j++) {
            if(nums.get(j) == dominant) {
                freqDominant++;
            }    
            if((j+1)/2 < freqDominant) {
                if(((len - 1 - j)/2) <= (max - freqDominant)) {
                    return j;
                }
            }
            freqPos.put(j, freqDominant);
        }
        return -1;
    }
}