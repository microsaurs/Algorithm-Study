import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // user id, nickname 저장 (수정까지 반영)
        HashMap<String, String> user = new HashMap<>();
        
        for(String r : record) {
            String[] arr = r.split(" ");
            String act = arr[0];
            String id = arr[1];
            if (act.equals("Enter") || act.equals("Change")) {
                user.put(id, arr[2]);
            }
        }
        
        // result 메세지 개수 세기
        int count = 0;
        for (String r : record) {
            String action = r.split(" ")[0];
            if (action.equals("Enter") || action.equals("Leave")) {
                count++;
            }
        }
        
        // 결과 배열 담기
        String[] result = new String[count];
        int index = 0;
        
        for(String log : record) {
            String[] arr = log.split(" ");
            String action = arr[0];
            String id = arr[1];
            String nickname = user.get(id);
            
            if (action.equals("Enter")) {
                result[index++] = nickname + "님이 들어왔습니다.";
            } else if (action.equals("Leave")) {
                result[index++] = nickname + "님이 나갔습니다.";
            }
        }
        
        return result;
    }
}