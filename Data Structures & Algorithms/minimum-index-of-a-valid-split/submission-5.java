/*
[2,1,3,1,1,1,7,1,2,1]

Hashmap que guarda a frequência com que o valor dominante aparece até 
à posição "i"
- Verificar se (length de 0 até i) / 2  =< freq de dominante até i
- Se sim, verificar se (length de i até length total) / 2 =<  freq total do dominante - freq gasta na verificação total)  
*/

class Solution {
    public int minimumIndex(List<Integer> nums) {

        Map<Integer, Integer> freq = new HashMap<>();

        // CALCULA DOMINANTE E A SUA FREQ
        int max = 0;
        int dominant = nums.getFirst();

        for(int i = 0; i < nums.size(); i++){
            if(freq.containsKey(nums.get(i))) {
                freq.put(nums.get(i), freq.get(nums.get(i)) + 1);
                if(max < freq.get(nums.get(i))) {
                    max = freq.get(nums.get(i));
                    dominant = nums.get(i);
                }
            } else {
                freq.put(nums.get(i), 1);
                if(max < 1) {
                    max = 1;
                    dominant = nums.get(i);
                }
            }
        }

        // CALCULA A FREQ ACUMULADA DO DOMINANTE POR POSICAO
        int len = nums.size();
        int freqDominant = 0;

        for(int j = 0; j < len - 1; j++) {
            if(nums.get(j) == dominant) {
                freqDominant++;
            }

            if((j+1)/2 < freqDominant) {
                if(((len - 1 - j)/2) < (max - freqDominant)) {
                    return j;
                }
            }
        }

        return -1;
    }
}