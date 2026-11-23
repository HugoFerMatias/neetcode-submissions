/*
Primeiro damos set da capcidade(numero potencial de elementos)
Depois preenchemos o resultado com -1.
Precisamos dee preencher o array pois o "set" posteerior não cria posições
apenas substitui elementos já existentes.
De seguida verificamos os elementos do array. Como o numero de elementos está entre
1 e nums.length. Vamos trocar o -1 na posicao nums[i] - 1 com o respetivo valor nums[i] 
(posicoes começam no 0, logo para o valor 1 temos a posicao 0, para o 6 temos a posicao 5 e etc).
Agora apenas os valores que não estão presentes na sequencia tem o valor -1 nas suas
respetivas posições.
Mas nos queremos os valores que faltam na sequencia então eprcoreemos o resultado e quando encontramos um valor diferente de -1, trocamos o seu valor para -1, pois são os valores que fazem parte da sequencia, os que não preicsamos. Caso o valor seja -1 significa que é um numero que nãoo pertence à sequência e por isso nesta posição adicionamos o respetivo valor "posicao + 1". Por fim, basta remover-mos os valores -1 e vão sobrar os valores que faltam na sequencia "nums"*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>(nums.length);

        for(int k = 0; k < nums.length; k++) {
            result.add(-1);
        }

        for(int i = 0; i < nums.length; i++) {
            result.set(nums[i] - 1, nums[i]);
        }
        
        for(int j = 0; j < nums.length; j++) {
            
            if(result.get(j) != -1) {
                result.set(j, -1);
            } else result.set(j, j + 1);
        }

        result.removeIf(n -> n == -1);

        return result;
    }
}