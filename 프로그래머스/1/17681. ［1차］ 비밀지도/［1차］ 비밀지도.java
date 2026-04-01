class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for(int i=0; i<n; i++) {
            int num = arr1[i] | arr2[i];
            String bin = String.format("%" + n + "s", Integer.toBinaryString(num)).replace("0", " ").replace("1", "#").replace("0", " ");
            result[i] = bin;
        }
        
        return result;
    }
}