class Solution {
    public String solution(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                sb.append(c);
                index = 0;
            } else {
                if(index % 2 == 1) {
                    sb.append(Character.toLowerCase(c));
                    index++;
                } else {
                    sb.append(Character.toUpperCase(c));
                    index++;
                }
            }
        }
        return sb.toString();
    }
}