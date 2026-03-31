import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        // 시작 손가락 위치
        int leftR = 3, leftC = 0;
        int rightR = 3, rightC = 2;
        
        StringBuilder sb = new StringBuilder();
        
        // 타겟 번호 반복문
        for(int num : numbers) {
            // 타겟 번호 위치
            int targetR = 0;
            int targetC = 0;
                
            if(num == 0) {
                targetR = 3;
                targetC = 1;
            } else {
                targetR = (num-1) / 3;
                targetC = (num-1) % 3;
            }
            
            // 현재 손 위치 변경 and result 추가
            if(num == 1 || num == 4 || num == 7) {
                leftR = targetR;
                leftC = targetC;
                sb.append("L");
            } else if(num == 3 || num == 6 || num == 9) {
                rightR = targetR;
                rightC = targetC;
                sb.append("R");
            } else { // 중간 숫자인 경우 거리 계산 로직
                int distL = Math.abs(targetR - leftR) + Math.abs(targetC - leftC);
                int distR = Math.abs(targetR - rightR) + Math.abs(targetC - rightC);
                
                if(distL < distR) {
                    leftR = targetR;
                    leftC = targetC;
                    sb.append("L");
                } else if(distL > distR) {
                    rightR = targetR;
                    rightC = targetC;
                    sb.append("R");
                } else {
                    if(hand.equals("right")) {
                        rightR = targetR;
                        rightC = targetC;
                        sb.append("R");
                    } else {
                        leftR = targetR;
                        leftC = targetC;
                        sb.append("L");
                    }
                }
            }
        }
        return sb.toString();
    }
}