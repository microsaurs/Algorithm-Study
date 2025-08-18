import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] days = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            days[i] = (remaining + speeds[i] - 1) / speeds[i];
        }
        
        List<Integer> result = new ArrayList<>();
        int maxDay = days[0];
        int count = 1;
        
        for (int i = 1; i < days.length; i++) {
            if (days[i] <= maxDay) {
                count++;
            } else {
                result.add(count);
                maxDay = days[i];
                count = 1;
            }
        }
        
        result.add(count);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}