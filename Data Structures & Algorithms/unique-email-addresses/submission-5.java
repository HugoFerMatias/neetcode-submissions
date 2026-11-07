/*
HashSet onde tem os emails
- Por cada email filtrar local name
- criar nova String caso tenha . ou +
- verificar se hashset já tem
- se não tiver adicionar ao counter de emails diferentes
- adicionar tambem o novo mail ao HashSet 
*/

class Solution {
    public int numUniqueEmails(String[] emails) {
        

        Set<String> seen = new HashSet<>();
        int count = 0;
        for(String em: emails) {

            StringBuilder filterEmailBuilder = new StringBuilder();
            boolean ignore = false;
            boolean isAfter = false;
            for(int j = 0; j < em.length(); j++) {
                Character c = em.charAt(j);
                
                if(c == '@') {
                        isAfter = true;
                        ignore = false;
                }
            
                if(c == '+' && !isAfter) {
                    ignore = true;
                } 
                
                if((!ignore && c != '.') || isAfter) {
                    filterEmailBuilder.append(c);
                }
            }
            String filterEmail = filterEmailBuilder.toString();
            System.out.println(filterEmail);
            if(!seen.contains(filterEmail)) {
                count++;
                seen.add(filterEmail);
            }
            
        }
        return count;
    }
}