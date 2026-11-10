/*
HashMap to map characters from s to t
as we had to map we check if new character found is already in map
and if the value on the map is the same being compared oon the other string
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> mapper = new HashMap<>();
         Map<Character, Character> mapper2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(mapper.containsKey(sChar)) {
                char value = mapper.get(sChar);
                if(mapper.get(sChar) != tChar) {
                    return false;
                }
            }
            else {
                mapper.put(sChar, tChar);
            }
        }

        for(int j = 0; j < s.length(); j++) {
            char sChar = s.charAt(j);
            char tChar = t.charAt(j);

            if(mapper2.containsKey(tChar)) {
                char value = mapper2.get(tChar);
                if(mapper2.get(tChar) != sChar) {
                    return false;
                }
            }
            else {
                mapper2.put(tChar, sChar);
            }
        }
        return true;
    }
}