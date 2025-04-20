package blackjack.domain.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {

    String input;
    ByteArrayInputStream testInputStream;
    @BeforeEach
    void setUp() {
        input = "pobi,jason\n10000\n20000";
        testInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInputStream);
    }

    @Test
    void createPlayers() {
        Players players = Players.create();
        assertThat(players.getPlayerCount()).isEqualTo(input.split(",").length);
    }

    @Test
    void getPlayersName() {
        Players players = Players.create();
        assertThat(players.getPlayerNames()).isEqualTo("pobi, jason");
    }

}