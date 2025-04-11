package blackjack.domain.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardsTest {
    private static final int CARDS_SIZE = 52;

    private Cards deck;
    @BeforeEach
    void setUp() {
        deck = Cards.createDeck();
    }

    @Test
    void checkShuffleTest() {
        deck.shuffle();
        //todo 셔플 테스트할 것.
    }
}