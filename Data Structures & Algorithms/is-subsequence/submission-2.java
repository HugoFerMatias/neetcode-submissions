/*
Dois pointers um percorree "t" o outro "s". Sempre que o caracter de s igual a t,
adicionamos 1 ao iterador de s para procurar a prooxima letra. 
Se o iterador de "s" != s.length(() return false else true. 
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() > t.length()) {
            return false;
        }

        if(s.length() == 0) return true;

        int j = 0;
        for(int i = 0; i < t.length() && j < s.length(); i++) {
            if(s.charAt(j) == t.charAt(i)) j++;
        }

        if(j == s.length()) {
            return true;
        } else return false;
    }
}