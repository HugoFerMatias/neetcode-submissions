/*
1+3+2+4 = 10
1+3+2+2 = 8
2 * 2   nums 1 -> 2^2 = 4

1+2+3+4+5+6+7+8+9 = 45 Sum
1+2+3+4+9+6+7+8+9 = 49 realSum
*/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        HashSet<Integer> seen = new HashSet<>();
        int repeated = 0;
        int sum = 0;
        int realSum = 0;
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(Integer num: grid[i]) {
                if (seen.contains(num)) {
                    repeated = num;
                } 
                count++;
                sum += count;
                realSum += num;
                seen.add(num);
            }
        }
        return new int[]{repeated,Math.abs(sum - (realSum-repeated))};
    }
}