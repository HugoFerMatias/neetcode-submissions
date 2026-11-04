/*
Percorrer "s" e "t" com dois pointers, Se pointer de s chega ao fim 
e pointer de t não, significa que desde a posica 

s = acoaching t = chill output = 2 (acoachingll) 
s = aching t = ill output = 2 (acoachingll) 
*/

class Solution {
    public int appendCharacters(String s, String t) {
        
        int j = 0;
        int count = 0; 
        for(int i = 0; i < s.length() && j < t.length(); i++) {
            if(s.charAt(i) == t.charAt(j)) j++;
        }

        while(j < t.length()) {
            count++;
            j++;
        }

        return count;
    }
}