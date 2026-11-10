/*



*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int j = 1;
            int k = 1;
            while(j <= i) {
                k = k * (i - j + 1) / j;
                row.add(k);
                j++;
            }
            pascal.add(row);
        }

        return pascal;

    }
}