// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {

        List<List<Pair>> sortedStates = new ArrayList<>();

        if (pairs.isEmpty()) {
            return sortedStates;
        }

        sortedStates.add(new ArrayList<>(pairs));

        for (int i = 1; i < pairs.size(); i++) {
            Pair curr = pairs.get(i);
            int j = i - 1;

            while (j >= 0 && pairs.get(j).key > curr.key) {
                pairs.set(j + 1, pairs.get(j));
                j--;
            }

            pairs.set(j + 1, curr);

            sortedStates.add(new ArrayList<>(pairs));
        }

        return sortedStates;
    }
}
