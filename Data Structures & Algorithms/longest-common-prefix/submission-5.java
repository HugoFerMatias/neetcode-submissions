class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        if(n == 1) {
            return strs[0];
        }
        
        String curr = compareExtractPrefix(strs[0], strs[1]);
        for(int i = 2; i < n; i++) {
            curr = compareExtractPrefix(curr, strs[i]);
        }

        return curr;
    }


/*
Compara duas Strings e extrai o prefixo em comum
*/
    private String compareExtractPrefix(String s1, String s2) {

        int minL;
        String minS;
        if (s1.length() == 0 || s2.length() == 0) {
            return "";
        } else if(s1.length() > s2.length()) {
            minL = s2.length(); 
            minS = s2;
        } else {
            minL = s1.length();
            minS = s1;
            }

        int i = 0;
        /*
        Ciclo que itera até encontrar um caracter diferente, ou seja, para no fim do prefixo comum
        */
        for(i=0; i< minL;i++) {
            if(s1.charAt(i) != s2.charAt(i)) break;
        }

        return minS.substring(0,i);

    }
    // ["sras","sraft","sraf"] n=3 ni=3*2=6 prev = "s"  sls=2 
}