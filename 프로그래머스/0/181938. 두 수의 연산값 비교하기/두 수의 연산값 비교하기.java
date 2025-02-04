class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
        int ba = 2*a*b;
        
        return ab >= ba ? ab : ba;
    }
}