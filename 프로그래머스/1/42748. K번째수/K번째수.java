import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int idx=0; idx<commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            int[] arr = new int[j-i+1];
            int index = 0;
            for(int a = i-1; a <= j-1; a++) {
                arr[index++] = array[a];
            }
            Arrays.sort(arr);
            answer[idx] = arr[k-1];
        }
        
        return answer;
    }
}