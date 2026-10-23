class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int num: nums) {
            result.add(num);
        }

        for(int num: nums) {
            result.add(num);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}