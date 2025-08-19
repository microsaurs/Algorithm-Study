import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }
        
        int executionOrder = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentPriority = current[0];
            int currentIndex = current[1];
            
            boolean hasHigherPriority = false;
            for (int[] process : queue) {
                if (process[0] > currentPriority) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            if (hasHigherPriority) {
                queue.offer(current);
            } 

            else {
                executionOrder++;
                if (currentIndex == location) {
                    return executionOrder;
                }
            }
        }
        
        return -1;
    }
}