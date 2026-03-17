import java.io.*;
import java.util.*;

public class Main {
    static class Player {
        int level;
        String name;

        Player(int level, String name) {
            this.level = level;
            this.name = name;
        }
    }

    static class Room {
        int baseLevel;
        List<Player> players;

        Room(Player player) {
            this.baseLevel = player.level;
            this.players = new ArrayList<>();
            this.players.add(player);
        }

        boolean canEnter(Player player, int m) {
            return players.size() < m &&
                   player.level >= baseLevel - 10 &&
                   player.level <= baseLevel + 10;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Room> rooms = new ArrayList<>();
        
        for(int i=0; i<p; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            Player player = new Player(level, name);

            boolean entered = false;

            for(Room room : rooms) {
                if(room.canEnter(player, m)) {
                    room.players.add(player);
                    entered = true;
                    break;
                }
            }

            if(!entered) {
                rooms.add(new Room(player));
            }
        }

        StringBuilder sb = new StringBuilder();

        for(Room room : rooms) {
            if(room.players.size() == m) {
                sb.append("Started!").append("\n");
            } else {
                sb.append("Waiting!").append("\n");
            }

            room.players.sort((a,b) -> a.name.compareTo(b.name));

            for(Player player : room.players) {
                sb.append(player.level).append(" ").append(player.name).append("\n");
            }
        }
        System.out.print(sb);
    }
}