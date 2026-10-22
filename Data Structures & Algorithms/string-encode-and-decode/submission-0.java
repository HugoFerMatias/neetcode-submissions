class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        int i = 0;
        for(String str: strs) {
            builder.append(str.length());
            builder.append("#");
            for(char c: str.toCharArray()) {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    // 5#Hello
    // i = 5
    // strl = 5
    // s = [Hello]
    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int strLength = 0;
        int i = 0;
        StringBuilder s = new StringBuilder();
        while (i < str.length()) {
            
            int currLength = 0;
            StringBuilder sl = new StringBuilder();
            // Encontra length até #
            while(Character.isDigit(str.charAt(i))) {
                sl.append(str.charAt(i));
                i++;
            }

            if(str.charAt(i) == '#') {
                i++;
            }

            currLength = Integer.parseInt(sl.toString());

            String substring = str.substring(i, i + currLength);
            i += currLength;
            result.add(substring);

        }
        return result;
    }
}
