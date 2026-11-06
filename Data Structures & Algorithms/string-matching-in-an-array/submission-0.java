/*
Sort no array por ordem decrescente
*/

class Solution {
    public List<String> stringMatching(String[] words) {

        Set<String> setResult = new HashSet<>();
        
        Arrays.sort(words,(a,b) -> 
            a.length() - b.length()
        );
        

        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++) {
                if(words[j].contains(words[i])) {
                    setResult.add(words[i]);
                }
            }
        }

        return new ArrayList<>(setResult);
    }
}