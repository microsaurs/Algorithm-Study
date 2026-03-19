class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        // X에 각 숫자가 몇 개 있는지 카운트
        for (int i = 0; i < X.length(); i++) {
            cntX[X.charAt(i) - '0']++;
        }
        
        // Y에 각 숫자가 몇 개 있는지 카운트
        for (int i = 0; i < Y.length(); i++) {
            cntY[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // 큰 숫자부터 작은 숫자 순으로 공통 개수만큼 붙이기
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(cntX[i], cntY[i]);
            
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        
        // 공통 숫자가 하나도 없으면
        if (sb.length() == 0) {
            return "-1";
        }
        
        // 전부 0으로만 이루어져 있으면 "0"
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}