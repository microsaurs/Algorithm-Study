import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        
        List<Integer> unique = new ArrayList<>();
        int p = 0, q = 0, r = 0;
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) return 1111 * i; 
            if (count[i] == 3) p = i;           
            if (count[i] == 2) {
                if (p == 0) p = i;             
                else q = i;  
            }
            if (count[i] == 1) {
                 if (q == 0) q = i;
                else r = i;    
            }
        }

        if (p != 0 && count[p] == 3) {
            return (int) Math.pow(10 * p + q, 2);
        } else if (q != 0 && count[p] == 2 && count[q] == 2) { 
            return (p + q) * Math.abs(p - q);
        } else if (count[p] == 2) { 
            return q * r;
        } else {
            return Math.min(a, Math.min(b, Math.min(c, d)));
        }
    }
}