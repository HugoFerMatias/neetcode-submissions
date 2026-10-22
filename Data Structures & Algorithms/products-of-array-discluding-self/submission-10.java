// Primeiro correr lista e multiplicar tudo
// dividir na posicao respetiva e colocar no outro array nessa mesma posicao

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int l = nums.length;
        int[] result = new int[l];
        int mult = 1;
        int zero = 0;
        for(int i = 0; i < l; i++) {
            if(zero > 0 && zero == i && nums[i] == 0) {
                zero += 1;
            } else if(nums[i] != 0) {
                mult *= nums[i];
            } else {
                zero += 1;
            }
            
        }

        for(int i = 0; i < l; i++) {
             if(zero > 1) {
                result[i] = 0; 
            } else if (zero == 1) {
                if(nums[i] != 0) {
                    result[i] = 0;
                } else {
                    result[i] = mult;
                }
            } else {
                result[i] = mult/nums[i];
            }
        }

        return result;
    }
}  
