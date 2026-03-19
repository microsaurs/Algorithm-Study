class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int idx = 0;
        int count = 0;

        for (int x : ingredient) {
            stack[idx++] = x;

            if (idx >= 4 &&
                stack[idx - 4] == 1 &&
                stack[idx - 3] == 2 &&
                stack[idx - 2] == 3 &&
                stack[idx - 1] == 1) {
                
                idx -= 4;
                count++;
            }
        }

        return count;
        
    }
}