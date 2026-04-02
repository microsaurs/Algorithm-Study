class Solution {
    public int[] solution(String[][] places) {
        int[] result = new int[5];
        
        for(int n=0; n<5; n++) {
            char[][] room = new char[5][5];
            
            for(int i=0; i<5; i++) {
                for(int j=0; j<5; j++) {
                    room[i][j] = places[n][i].charAt(j);
                }
             }
            result[n] = checkRoom(room) ? 1 : 0;
        }
        
        return result;
    }
    
    private boolean checkRoom(char[][] room) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(room[i][j] == 'P') {
                    if(!isValid(room, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] room, int r, int c) {
        int n = 5;
        
        // 거리 1 검사
        int[] dr1 = {-1, 1, 0, 0};
        int[] dc1 = {0, 0, -1, 1};
        
        for(int d=0; d<4; d++) {
            int nr = r + dr1[d];
            int nc = c + dc1[d];
            
            if(nr>=0 && nr<n && nc>=0 && nc<n) {
                if(room[nr][nc] == 'P') return false;
            }
        }
        
        // 거리 2 검사
        int[] dr2 = {-2, 2, 0, 0};
        int[] dc2 = {0, 0, -2, 2};
        
        for(int d=0; d<4; d++) {
            int nr = r+dr2[d];
            int nc = c+dc2[d];
            
            if(nr>=0 && nr<n && nc>=0 && nc<n) {
                if(room[nr][nc] == 'P') {
                int mr = r + dr2[d] / 2;
                int mc = c + dc2[d] / 2;
                
                if(room[mr][mc] != 'X') return false;
                }
            }
        }
        
        // 대각선 검사
        int[] dr3 = {-1, -1, 1, 1};
        int[] dc3 = {-1, 1, -1, 1};
        
        for(int d=0; d<4; d++) {
            int nr = r+dr3[d];
            int nc = c+dc3[d];
            
            if(nr>=0 && nr<n && nc>=0 && nc<n) {
                if(room[nr][nc] == 'P') {
                    if(room[r][nc] != 'X' || room[nr][c] != 'X') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}