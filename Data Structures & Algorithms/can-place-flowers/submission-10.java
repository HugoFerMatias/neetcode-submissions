//[1,0,0,0,0,0,1] 7-3: 1  7-2:2

// Se nº de 1's >
//[1,0]

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int[] padded = new int[flowerbed.length + 2];

         for (int i = 0; i < flowerbed.length; i++) {
            padded[i + 1] = flowerbed[i];
        }

        int prev;
        int prox;
        for(int i = 1; i < padded.length - 1; i++) {
            prev = padded[i-1];
            prox = padded[i+1];
            if(prox != 1 && prev != 1 && padded[i] != 1) {
                n-=1;
                padded[i] = 1;
            }
        }
        if(n <= 0) return true;
        return false;
    }
}