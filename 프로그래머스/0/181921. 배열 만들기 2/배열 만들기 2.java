import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String numStr = String.valueOf(i);
            boolean valid = true;
            
            for(char c : numStr.toCharArray()) {
                if(c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }
            
            if(valid) {
                result.add(i);
            }
        }
        if(result.isEmpty()) {
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}