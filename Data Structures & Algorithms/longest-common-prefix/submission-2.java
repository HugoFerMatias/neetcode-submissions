class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        if(n == 1) {
            return strs[0];
        }
        
        StringBuilder curr = new StringBuilder(compareExtractPrefix(strs[0], strs[1]));
        for(int i = 2; i < n; i++) {
            StringBuilder sb = new StringBuilder(compareExtractPrefix(strs[i-1], strs[i]));

            if(curr.length() > sb.length()) {
                curr = sb;
            }
        }

        return curr.toString();
    }


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
        for(i=0; i< minL;i++) {
            if(s1.charAt(i) != s2.charAt(i)) break;
        }

        return minS.substring(0,i);

    }
    // ["sras","sraft","sraf"] n=3 ni=3*2=6 prev = "s"  sls=2 
}