import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();
        
        for(int len : course) {
            // 세트메뉴 조합별 개수 저장 map
            Map<String, Integer> map = new HashMap<>();
            
            // 주문 메뉴 정렬 : 메뉴 주문 순서에 따라 달라지는 조합 통일
            for(String order : orders) {
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                comb(arr, len, 0, new StringBuilder(), map);
            }
            
            int max = 0;
            for(int count : map.values()) {
                if(count >= 2) {
                    max = Math.max(max, count);
                }
            }
            
            for(String key : map.keySet()) {
                if(map.get(key) == max && max >= 2) {
                    result.add(key);
                }
            }
        }
        
        Collections.sort(result);
        return result.toArray(new String[0]);
    }
    
    void comb(char[] arr, int len, int idx, StringBuilder sb, Map<String, Integer> map) {
        if (sb.length() == len) {
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            return;
        }
        
        for (int i = idx; i < arr.length; i++) {
            sb.append(arr[i]);
            comb(arr, len, i + 1, sb, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}