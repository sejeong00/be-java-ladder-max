package kr.codesquad.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerList {
    List<PlayerName> players = new ArrayList<>();

    public PlayerList(String players) {
        setPlayers(players);
    }

    private void setPlayers(String players){
        Arrays.stream(players.split(","))
                .forEach(p -> this.players.add(new PlayerName(p)));
    }

    public int size(){
        return players.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(PlayerName player : players){
            sb.append(String.format("%5s ", player));
        }

        return sb.toString();
    }

}
