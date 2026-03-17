import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            sum += c - '0';
        }
        return sum;
    }
}