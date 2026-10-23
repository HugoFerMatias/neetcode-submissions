// raccecc
// areceee

class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sL = s.length();
        int tL = t.length();

        if(sL != tL) {
            return false;
        }
        
        Map<Character, Integer> freq = new HashMap<>();

        for(char c: s.toCharArray()) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        for(char c: t.toCharArray()) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);
            } else {
                return false;
            }
        }

        for(int f: freq.values()) {
            if (f != 0) {
                return false;
            }
        }
        return true;

    }
}
