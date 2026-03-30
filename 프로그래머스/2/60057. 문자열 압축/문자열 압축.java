import java.util.*;

class Solution {
    public int solution(String s) {
        // 문자열 길이가 1이면 압축 x
        if(s.length() == 1) return 1;
        
        int answer = s.length();
        
        // 자르는 단위를 1~s.length()/2 까지 전부 시도
        for(int unit = 1; unit<=s.length()/2; unit++) {
            StringBuilder sb = new StringBuilder();
            
            // 첫 조각
            String prev = s.substring(0, unit);
            int count = 1;
            // unit 크기씩 잘라서 비교
            for(int i=unit; i<s.length(); i+= unit) {
                int end = Math.min(i + unit, s.length());
                String curr = s.substring(i, end);
                
                if(prev.equals(curr)) {
                    count++;
                } else {
                    if(count>1) sb.append(count);
                    sb.append(prev);
                    prev = curr;
                    count = 1;
                }
            }
            
            // 마지막 남은 문자열 처리
            if(count>1) sb.append(count);
            sb.append(prev);
            
            // 최소 길이 갱신
            answer = Math.min(answer, sb.length());
        }
        
        return answer;
    }
}