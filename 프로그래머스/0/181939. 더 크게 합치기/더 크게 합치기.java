class Solution {
    public int solution(int a, int b) {
        int i = Integer.parseInt(Integer.toString
                                 (a) + Integer.toString(b));
        int j = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        if(i > j) {
            return i;
        } else if (j > i) {
            return j;
        } else {
            return i;
        }
        
    }
}