package blackjack.domain.person;

import blackjack.util.InputUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> players = new ArrayList<>();

    public static Players create() {
        return new Players();
    }

    public int getPlayerCount() {
        return players.size();
    }

    public String getPlayerNames() {
        return players.stream()
                .map(Player::getName)
                .collect(Collectors.joining(", "));
    }

    private Players() {
        String[] names = InputUtils.inputPlayersName();
        Arrays.stream(names)
                .forEach(name -> addPlayer(new Player(name)));

        initializePlayersBets();
    }

    private void initializePlayersBets() {
        players.forEach(player -> {
            int bet = InputUtils.inputPlayerBet(player.getName());
            player.initBet(bet);
        });
    }

    private void addPlayer(Player player) {
        players.add(player);
    }
}
