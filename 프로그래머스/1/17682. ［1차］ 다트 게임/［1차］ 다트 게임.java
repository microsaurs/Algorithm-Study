class Solution {
    public int solution(String dartResult) {
        int[] result = new int[3];
        int idx = -1;
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(Character.isDigit(c)) {
                idx++;
                
                if(c == '1' && i+1 < dartResult.length() &&dartResult.charAt(i+1) == '0') {
                    result[idx] = 10;
                    i++;
                } else {
                    result[idx] = c-'0';
                }
            } else if(c == 'D') {
                result[idx] *= result[idx];
            } else if(c == 'T') {
                result[idx] = result[idx]*result[idx]*result[idx];
            } else if(c == '*') {
                result[idx] *= 2;
                if(idx > 0) {
                    result[idx-1] *= 2;
                }
            } else if(c == '#') {
                result[idx] *= -1;
            }
        }
        
        return result[0] + result[1] + result[2];
    }
}