class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            /*
            i < j é preciso pois se for um String só caracters não alfanumericos
            tipo ",." o 'i' vai ficar igual a s.length e ao fazer s.charAt(i) vai dar 
            exception out of bounds 
            */
            while(!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
