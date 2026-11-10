class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        pascal.add(firstrow);
        for(int i = 0; i < numRows - 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 0; j < i; j++) {
                row.add(pascal.get(i).get(j + 1) + pascal.get(i).get(j));
            }
            row.add(1);
            pascal.add(row);
        }
        return pascal;
    }
}