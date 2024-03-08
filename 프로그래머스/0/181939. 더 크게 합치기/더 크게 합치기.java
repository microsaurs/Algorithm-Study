class Solution {
    public int solution(int a, int b) {
        int i = Integer.parseInt(Integer.toString
                                 (a) + Integer.toString(b));
        int j = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        return i >= j ? i : j;
        
    }
}