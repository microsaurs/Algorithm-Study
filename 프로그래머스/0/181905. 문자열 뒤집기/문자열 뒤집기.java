class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        
        String part = sb.substring(s, e + 1);
        sb.replace(s, e + 1, new StringBuilder(part).reverse().toString());
        
        return sb.toString();
    }
}