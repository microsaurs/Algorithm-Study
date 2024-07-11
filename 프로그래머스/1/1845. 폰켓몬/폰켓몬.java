import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        int i;
        for (i=0; i < nums.length; i++) {
             int k = nums[i];
            set.add(k);
        }
        
        return (set.size() >= nums.length / 2) ? (nums.length / 2) : set.size();
        
    }
}