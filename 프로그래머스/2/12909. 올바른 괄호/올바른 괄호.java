import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        boolean answer = true;
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                dq.push(c);
            } else {
                if(!dq.isEmpty() && dq.peek() == '(') {
                    dq.pop();
                } else {
                    answer = false;
                }
            }
        }
        
        if(dq.size() != 0) answer = false;
        
        return answer;
    }
}