import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        
    HashSet<String> hs = new HashSet<>();
    for (String p : phone_book) {
        hs.add(p);
    }
    
    for (String p : phone_book) {    
        for (int i = 1; i < p.length(); i++) {
            String prefix = p.substring(0, i);
            
            if (hs.contains(prefix)) {
                return false;
            }
        }
    }
    
    return true;
    }
}