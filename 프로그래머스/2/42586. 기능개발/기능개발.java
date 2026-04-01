import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int curr = ((100-progresses[0]) + speeds[0] - 1) / speeds[0];
        int count = 1;
        
        for(int i=1; i<progresses.length; i++) {
            int day = ((100-progresses[i]) + speeds[i] - 1) / speeds[i];
            if(day <= curr) {
                count++;
            } else {
                list.add(count);
                curr = day;
                count = 1;
            }
        }
        list.add(count);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}