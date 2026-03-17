class Solution {
    public long solution(int a, int b) {
        long start = Math.min(a, b);
        long end = Math.max(a, b);

        return (start + end) * (end - start + 1) / 2;
    }
}