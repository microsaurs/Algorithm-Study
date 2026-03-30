import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //1. 중복 신고 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        //2. 신고당한 유저 map (유저, 횟수)
        HashMap<String, Integer> reportedMap = new HashMap<>();
        for(String r : reportSet) {
            String[] arr = r.split(" ");
            String to = arr[1];
            reportedMap.put(to, reportedMap.getOrDefault(to, 0)+1);
        }
        //3. 유저가 받을 메일 수(결과)
        Map<String, Integer> userMap = new HashMap<>();
        for(int i=0; i<id_list.length; i++) {
            userMap.put(id_list[i], i);
        }
        
        int[] answer = new int[id_list.length];
        
        for(String r : reportSet) {
            String[] arr = r.split(" ");
            String from = arr[0];
            String to = arr[1];
            
            if(reportedMap.get(to) >= k) {
                answer[userMap.get(from)]++;
            }
        }
        
        return answer;
    }
}