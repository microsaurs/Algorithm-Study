import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int mh = 0;
        int mw = 0;
        
        for(int[] i : sizes) {
            int w = Math.max(i[0], i[1]);
            int h = Math.min(i[0], i[1]);
            
            mw = Math.max(mw, w);
            mh = Math.max(mh, h);
        }
        
        return mw*mh;
    }
}