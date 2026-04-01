import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (remain + speeds[i] - 1) / speeds[i];
            dq.add(day);
        }
        
        List<Integer> result = new ArrayList<>();
        int curr = dq.pop();
        int count = 1;
        
        while(!dq.isEmpty()) {
            if(dq.peek() <= curr) {
                dq.pop();
                count++;
            } else {
                result.add(count);
                curr = dq.pop();
                count = 1;
            }
        }
        result.add(count);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}