class Solution {
    public String solution(int[] numbers, String hand) {
       StringBuilder sb = new StringBuilder();
        
        // 왼손 시작 위치 *
        int leftR = 3, leftC = 0;
        // 오른손 시작 위치 #
        int rightR = 3, rightC = 2;
        
        for(int n:numbers) {
            int targetR = 0;
            int targetC = 0;
            
            // 숫자 좌표 구하기
            if(n == 0) {
                targetR = 3;
                targetC = 1;
            } else {
                targetR = (n-1) / 3;
                targetC = (n-1) % 3;
            }
            
            // 왼쪽 열
            if(n == 1 || n == 4 || n == 7) {
                sb.append("L");
                leftR = targetR;
                leftC = targetC;
            } else if (n == 3 || n == 6 || n == 9) { // 오른쪽 열
                sb.append("R");
                rightR = targetR;
                rightC = targetC;
            } else { // 가운데 열
                int leftDist = Math.abs(leftR - targetR) + Math.abs(leftC - targetC);
                int rightDist = Math.abs(rightR - targetR) + Math.abs(rightC - targetC);
                
                if(leftDist < rightDist) {
                    sb.append("L");
                    leftR = targetR;
                    leftC = targetC;
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    rightR = targetR;
                    rightC = targetC;
                } else {
                    if(hand.equals("right")) {
                        sb.append("R");
                        rightR = targetR;
                        rightC = targetC;
                    } else {
                        sb.append("L");
                        leftR = targetR;
                        leftC = targetC;
                    }
                }
            }   
        }
        
        return sb.toString();
    }
}