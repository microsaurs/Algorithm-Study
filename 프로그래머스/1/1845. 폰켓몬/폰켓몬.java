import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int i;
        
        for (i=0; i < nums.length; i++) {
             int k = nums[i];
            set.add(k);
            
        }
        
        if(set.size() >= nums.length/2) {
            return nums.length/2;
        } else {
            return set.size();
        }
        
    }
}