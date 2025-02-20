class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for(int i=0; i < included.length; i++) {
            if(i==0 && included[0]) {
                sum += a;    
            };
            
            if(i > 0 && included[i]) {
                sum += a + d*i;
            };
        }
        return sum;
    }
}