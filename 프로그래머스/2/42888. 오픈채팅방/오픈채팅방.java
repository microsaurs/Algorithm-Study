import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> users = new HashMap<>();
        
        // 닉네임 최신화
        for(String s : record) {
            String[] arr = s.split(" ");
            String action = arr[0];
            
            if(action.equals("Enter") || action.equals("Change")) {
                users.put(arr[1], arr[2]);
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for(String s : record) {
            String[] arr = s.split(" ");
            String action = arr[0];
            String id = arr[1];
            
            if(action.equals("Enter")) {
                list.add(users.get(id) + "님이 들어왔습니다.");
            } else if(action.equals("Leave")) {
                list.add(users.get(id) + "님이 나갔습니다.");
            }
        }
        
        return list.toArray(new String[0]);
    }
}