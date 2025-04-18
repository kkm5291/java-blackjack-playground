package blackjack.domain.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {

    String input;
    @BeforeEach
    void setUp() {
        input = "pobi,jason";
        ByteArrayInputStream testInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInputStream);
    }

    @Test
    void createPlayers() {
        Players players = Players.create();
        assertThat(players.getPlayerCount()).isEqualTo(input.split(",").length);
    }

}