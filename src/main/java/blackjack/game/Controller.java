package blackjack.game;

import blackjack.domain.person.Players;
import blackjack.util.InputUtils;

import static blackjack.util.InputUtils.*;

public class Controller {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Players players = Players.create();
        initPrintCardInfo(players);
    }
}
