import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
        
        LinkedList<String> cache = new LinkedList<>();
        
        for(String city : cities) {
            city = city.toLowerCase();
            
            if(cacheSize == 0) {
                time += 5;
                continue;
            }
            
            // cache hit
            if(cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                time += 1;
            }
            else {
                if(cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                cache.add(city);
                time += 5;
            }
        }
        return time;
    }
}