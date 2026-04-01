import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> dq = new ArrayDeque<>();
        
        for(int i=0; i<priorities.length; i++) {
            dq.offer(new int[]{i, priorities[i]});
        }
        
        int count = 0;
        
        while(!dq.isEmpty()) {
            int[] curr = dq.poll();
            boolean hasHigher = false;
            
            for(int[] doc : dq) {
                if(doc[1] >curr[1]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher) {
                dq.offer(curr);
            } else {
                count++;
                if(curr[0] == location) {
                    return count;
                }
            }
        }
        return count;
    }
}