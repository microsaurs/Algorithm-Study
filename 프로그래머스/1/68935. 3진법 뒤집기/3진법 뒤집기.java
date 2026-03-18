import java.util.*;

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String num = sb.toString();
        int answer = 0;
        
        for(int i=0; i<num.length(); i++) {
            answer = answer * 3 + (num.charAt(i) - '0');
        }
        
        return answer;
    }
}