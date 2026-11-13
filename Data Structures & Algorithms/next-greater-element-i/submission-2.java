/*
Intuicao é pegar em cada elemento de nums1
depois percorrer nums2 à procura dele, quando encontrar
continuar a percorrer o array até encontrar um elemento maior ou 
até ao fim (-1). Isto faz com que no pior dos casos tenhamos de percorrer
o array de tamanho n, m vezes por cada elemento até o encontrarmos, o que vai ser O(n*m)

A ordem do resultado importa, ou seja, o resultado na posição "i" tem de corresponder à posição "i" no array num1. Assim temos de guardar a posição do numero de nums1 que estamos a verificar. 
Percorremos nums1 e adicionamos o valor à key e a posicao ao value.
Depois iteramos nums2 e verificamos se o elemento na posicao "j" se encontra no map.
Se sim, retiramos do map o valor dele correspondente à posição "p" no nums1 e resultado e de seguida iniciamos um novo ciclo à procura de um elemento maior que ele. Ao encontrarmos esse elemento, adicionamos no array resultado o valor na posição "p".
Caso não encontremos um valor maior, significa que ele não existe então na posição "p" no array resultado temos de meter "-1".
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