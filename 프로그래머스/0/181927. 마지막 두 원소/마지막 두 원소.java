import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> numList = new ArrayList<>();
        for (int num : num_list) {
            numList.add(num);
        }
        
         int last = num_list[num_list.length - 1];  
        int secondLast = num_list[num_list.length - 2]; 

        if (last > secondLast) {
            numList.add(last - secondLast); 
        } else {
            numList.add(last * 2);  
        }
        
        return numList.stream().mapToInt(i -> i).toArray();

    }
}