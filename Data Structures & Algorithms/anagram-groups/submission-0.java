class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String,List<String>> seen = new HashMap<>();
        int i = 0;
        for(String s: strs){
            char[] auxArray = s.toCharArray();
            Arrays.sort(auxArray);
            String osk = new String(auxArray);
            if(!seen.containsKey(osk)) {
                seen.put(osk, new ArrayList<>());
                seen.get(osk).add(s);
            } else {
                seen.get(osk).add(s);
            }
        }
        return new ArrayList<>(seen.values());
    }
}
