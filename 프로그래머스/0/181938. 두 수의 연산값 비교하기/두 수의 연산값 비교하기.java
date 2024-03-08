class Solution {
    public int solution(int a, int b) {
        int i = Integer.parseInt(""+a+b);
        int j = 2 * a * b;
        return i >= j ? i : j;
    }
}