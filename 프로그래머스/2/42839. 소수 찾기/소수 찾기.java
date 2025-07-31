import java.util.*;

class Solution {
	Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers){
    	permutation("", numbers);
        
        int count = 0;
        for(int num : set) {
        	if(isPrime(num)) count++;
        }
        
        return count;
    }
    
    public void permutation(String prefix, String str) {
    	if(!prefix.equals("")) {
        	set.add(Integer.parseInt(prefix));
        }
        
        for(int i=0; i < str.length(); i++){
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
        }
    }
    
     public boolean isPrime(int n) {
        	if (n < 2) return false;
            
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
 
        	return true;    		
     }
}