class Solution {
    private int maxDungeons = 0;
    
    public int solution(int k, int[][] dungeons) {
        maxDungeons = 0;
        boolean[] visited = new boolean[dungeons.length];
        
        backtrack(k, dungeons, visited, 0);
        
        return maxDungeons;
    }
    
    private void backtrack(int currentFatigue, int[][] dungeons, 
                          boolean[] visited, int exploredCount) {
        
        maxDungeons = Math.max(maxDungeons, exploredCount);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (canExplore(i, currentFatigue, dungeons, visited)) {
                visited[i] = true;
                int newFatigue = currentFatigue - dungeons[i][1];
                
                
                backtrack(newFatigue, dungeons, visited, exploredCount + 1);
                                
                visited[i] = false;
            }
        }
    }
    
    private boolean canExplore(int dungeonIndex, int currentFatigue, 
                              int[][] dungeons, boolean[] visited) {
        return !visited[dungeonIndex] && 
               currentFatigue >= dungeons[dungeonIndex][0];
    }
}

