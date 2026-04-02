import java.util.*;

class Solution {
    public int solution(String s) {
        int result = s.length();
        
        for(int unit=1; unit<=s.length()/2; unit++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            String prev = s.substring(0, unit);            
            
            for(int i=unit; i<s.length(); i+=unit) {
                int end = Math.min(i+unit, s.length());
                String curr = s.substring(i, end);
                
                if(prev.equals(curr)) {
                    count++;
                } else {
                    if(count > 1) {
                        sb.append(count);
                    }
                    sb.append(prev);
                    prev = curr;
                    count = 1;
                }
            }
            if(count > 1) {
                sb.append(count);
            }
            sb.append(prev);
            result = Math.min(sb.length(), result);
        }
            
        return result;
    }
}