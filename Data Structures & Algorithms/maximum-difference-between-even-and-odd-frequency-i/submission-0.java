/*
Criar variaveis bigOdd e smallEven que guardam a maior 
freq impar e a menor freq par
HashMap de freq onde há medida que vamos adicionando
os caracteres vamos contanto e verificando as variaveis criadas acima
No fim fazemos a diff

"aaaaabbc" 8 len
a -> 1 bigOdd = 1 smallEven = 8
a -> 2 bigOdd = 1 smallEven = 2
a -> 3 bigOdd = 3 smallEven = 2
a -> 4 bigOdd = 3 smallEven = 2
a -> 5 bigOdd = 5 smallEven = 2
b -> 1 bigOdd = 5
b -> 2 
*/

class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character,Integer> freq = new HashMap<>();

        int bigOdd = 0;
        int smallEven = s.length(); // constraint diz que length >= 3 logo vai ter no mini
        for(char c: s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(Integer f: freq.values()) {
            if(f % 2 != 0 && bigOdd < f) {
                bigOdd = f;
            } else if(f % 2 == 0 && smallEven > f) {
                smallEven = f;
            }
        }
        return bigOdd - smallEven;

    }
}