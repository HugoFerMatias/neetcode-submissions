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

        if(pairs.size() == 0) {
            return new ArrayList<>();
        } 

        if(pairs.size() == 1) {
            sortedStates.add(pairs);
            return sortedStates;
        }

        sortedStates.add(new ArrayList<>(pairs));
        for(int i = 1; i < pairs.size(); i++) {
            
            
            Pair curr = pairs.get(i);
            for(int j = i - 1; j >= 0; j--) {

                    /*
                    Se atual for menor que o anterior, continuamos a procurar
                    para ver se há algum ainda menor
                    */
                    if(pairs.get(j).key > curr.key) {
                        Pair temp = pairs.get(j);
                        pairs.set(j, curr);
                        pairs.set(j + 1, temp);
                    } 
                    /*
                    Se encontrar um valor menor ou igual ao atual, paro pois encontrei 
                    onde devo dar insert do elemento
                    */
                    else {
                        break;
                    }
                }
                    sortedStates.add(new ArrayList<>(pairs));
                }
            
            
            

        return sortedStates;
    }
}
