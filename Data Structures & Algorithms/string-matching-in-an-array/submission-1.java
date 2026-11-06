class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                /*
                i != j para nao comparar a mesma string,
                se isto acontecesse a comparação iria dar true
                e adicionaria a string errôneamente ao resultado
                */
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        
        return result;
    }
}