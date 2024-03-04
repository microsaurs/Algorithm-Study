class Solution {
    public int solution(int[] num_list) {
        int amt = 1;
        if(num_list.length <= 10) {
            for (int i=0; i<num_list.length; i++) {
                amt *= num_list[i];
            } 
        } else {
            amt = 0;
            for (int i=0; i<num_list.length; i++) {
                amt += num_list[i];
            }
        }
        return amt;
    }
}