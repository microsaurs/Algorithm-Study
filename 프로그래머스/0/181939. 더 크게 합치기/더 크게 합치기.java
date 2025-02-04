class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a).concat(Integer.toString(b));
        String ba = Integer.toString(b).concat(Integer.toString(a));
        
        return Integer.parseInt(ab) > Integer.parseInt(ba) ? Integer.parseInt(ab) : Integer.parseInt(ba);
    }
}