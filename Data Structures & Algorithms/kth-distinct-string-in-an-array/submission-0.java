/*
HashMap com string e posicao onde apareceu.
Se voltar a aparecer String remover do HashMap
Se entretanto encontrar uma String distinta que posicao == k,
verificar até ao fim se existe alguma string igual a essa no array
se não, retornar essa string, se sim retornar "". 
caso posicao máxima < k então retornar "". 
*/

class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> freqs = new HashMap<>();

        for(String s: arr) {
            freqs.put(s, freqs.getOrDefault(s, 0) + 1);
        }

        for(String s: arr) {
            if(freqs.get(s) == 1) {
                k--;
            } 
            if(k == 0) {
                return s;
            }
        }
        return "";
       }
    }
