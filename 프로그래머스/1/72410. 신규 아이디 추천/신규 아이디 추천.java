class Solution {
    public String solution(String new_id) {
        // 1단계 : 소문자
        String answer = new_id.toLowerCase();
        
        // 2단계 : 허용된 문자 사용
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<answer.length(); i++) {
            char c = answer.charAt(i);
            
            if(Character.isLowerCase(c) || Character.isDigit(c) 
                || c == '-' || c == '_' || c == '.') sb.append(c); 
        }
        answer = sb.toString();

        // 3단계 : 연속된 마침표 1개로 치환
        sb = new StringBuilder();
        for(int i=0; i<answer.length(); i++) {
            char c = answer.charAt(i);

            if(c == '.') {
                if(sb.length() == 0 || sb.charAt(sb.length() - 1) != '.') {
                    sb.append(c);
                } 
            } else {
                sb.append(c);
            }
        }
        answer = sb.toString();
        
        // 4단계 : 처음, 끝 마침표 제거
        if (answer.length() > 0 && answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        
        if(answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 5단계 : 빈 문자열이면 "a"
        if(answer.equals("")) answer = "a";
        
        // 6단계 : 길이가 16 이상이면 15개만 남기고, 끝이 마침표면 제거
        if(answer.length() >= 16) {
            answer = answer.substring(0,15);
        }
        
        if(answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 7단계 : 길이가 2 이하이면 마지막 무자를 길이 3이 될 때까지 반복
        while(answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}