import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.substring(2,s.length()-2).split("\\},\\{");
        
        Arrays.sort(arr, (a,b) -> a.length() - b.length());
        
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for(String str : arr) {
            for(String num : str.split(",")) {
                int n = Integer.parseInt(num);
                if(!set.contains(n)) {
                    set.add(n);
                    result.add(n);
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}