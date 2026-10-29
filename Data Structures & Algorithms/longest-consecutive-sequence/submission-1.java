
class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();

        int count = 0;
        int max = 0;

        /*
        Transformar o array em hashset para fazer pesquisa para os consecutivos
        em complexidade temporal constante.
        */
        for(int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i])) {
                seen.add(nums[i]);
            }
        }

        /*
        Percorre o array para verificar se os elementos consecutivos estão no set 
        e calcular o tamanho das sequências.
        */
        for(int j = 0; j < nums.length; j++) {
            /*
            Corresponde ao elemento imediatamente anterior (-1) ao atual.
            */
            int k = nums[j] - 1;
            /*
            Verifica se o elemento atual do array é um elemento de 
            inicio de sequência, ou seja, se não tem nenhum valor no array que precede
            este valor.
            Se não tiver, o elemento pode ser um inicio de uma sequência.
            */
            if(!seen.contains(k)) {
                /*
                Como o elemento atual é inicio de sequência adicionamos 1 a k
                para começar a contagem da sequência a partir do elemento atual.
                */
                k++;
                /*
                Enquanto o set que representa o array tiver o valor de k
                continua. Por cada k incrementamos count por 1 para medir a
                sequência atual. Incrementamos tambem k para verificar se o 
                numero consecutivo ao k atual tambem se encontra no array.
                */
                while(seen.contains(k)) {
                    count++;
                    k++; 
                }

                /*
                Ao terminar a contagem de uma sequência comparamos o comprimento
                da sequência com o comprimento da sequência máxima que tivemos
                até ao momento. Se o valor da atual for maior que o da máxima,
                o valor da maxima passa a ser a da atual.
                */
                if(max < count) {
                    max = count;
                }
            }
            // Reset no count para contar a próxima sequência.
            count = 0;
        }
        

        return max;

    }
}
