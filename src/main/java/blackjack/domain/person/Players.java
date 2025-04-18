package blackjack.domain.person;

import blackjack.util.InputUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Players {
    private final List<Player> players = new ArrayList<>();

    public static Players create() {
        return new Players();
    }
    private Players() {
        String[] names = InputUtils.inputPlayerName();
        Arrays.stream(names)
                .forEach(name -> addPlayer(new Player(name)));
    }

    private void addPlayer(Player player) {
        players.add(player);
    }

    public int getPlayerCount() {
        return players.size();    }
}
