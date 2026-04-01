import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        LinkedList<String> cache = new LinkedList<>();
        int time = 0;
        
        for(String city : cities) {
            city = city.toLowerCase();
            
            if(cacheSize == 0) {
                time += 5;
                continue;
            }
            
            if(!cache.contains(city)) {
                if(cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                time += 5;
                cache.add(city);
            } else {
                time += 1;
                cache.remove(city);
                cache.add(city);
            }
        }
        return time;
    }
}