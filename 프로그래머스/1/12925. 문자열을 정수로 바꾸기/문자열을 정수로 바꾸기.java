import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isMinus = false;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(i == 0) {
                if(c == '-' || c == '+') {
                    sb.append(c);
                } else {
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}