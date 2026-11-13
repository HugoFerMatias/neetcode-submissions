/*
Intuicao é pegar em cada elemento de nums1
depois percorrer nums2 à procura dele, quando encontrar
continuar a percorrer o array até encontrar um elemento maior ou 
até ao fim (-1). Isto faz com que no pior dos casos tenhamos de percorrer
o array de tamanho n, m vezes por cada elemento até o encontrarmos, o que vai ser O(n^2)

Se criar um HashMap e meter os elementos de nums2 onde cada key é um elemento de nums2 
e o value é o proximo maior valor.
Ao percorrer nums2 e encontrar um valor menor do que estamos a comparar, devemos guardar a posição deste. Continuamos a iterar e assim que encontrarmos um valor maior no array, desde a posição que guardamos até à atual atualizamos no HashMap os valores desse subarray para conterem o proximo valor maior igual ao que acabamos de encontrar.
Se não encontrarmos nenhum valor maior, atualizamos para comparar o valor a seguir a este.

Depois de fazer esta iteração é apenas necessário percorrer o nums1 e verificar se o valor está contido no HashMap e retirar o valor que lá está.
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        int p = 0;
        for(int j = 0; j < nums2.length; j++) {
            if(map.containsKey(nums2[j])) {
                int k = j;
                while(k < nums2.length) {
                    p = map.get(nums2[j]);
                    if(nums2[k] > nums2[j]) {
                        result[p] = nums2[k];
                        break;
                    }
                    k++;
                    if(k == nums2.length) {
                        result[p] = -1;
                    }
                }
            }
        }
        return result;
    }
}