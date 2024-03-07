class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int len1 = my_string.length();
        int len2 = overwrite_string.length();
        
        return my_string.substring(0,s) + overwrite_string 
            + my_string.substring(s+len2, len1);
    }
}