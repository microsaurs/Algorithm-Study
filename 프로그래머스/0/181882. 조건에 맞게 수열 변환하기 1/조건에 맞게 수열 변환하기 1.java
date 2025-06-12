import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val >= 50 && val % 2 == 0) {
                result[i] = val / 2;
            } else if (val < 50 && val % 2 == 1) {
                result[i] = val * 2;
            } else {
                result[i] = val;
            }
        }
        
        return result;
    }
}