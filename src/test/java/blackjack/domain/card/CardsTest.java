package blackjack.domain.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CardsTest {
    private static final int CARDS_SIZE = 52;

    private Cards cards;
    @BeforeEach
    void setUp() {
        cards = Cards.createDeck();
    }

    @Test
    void checkShuffle() {
        Cards shuffledCards = Cards.createDeck();
        shuffledCards.shuffle();
        assertNotEquals(cards, shuffledCards);
    }

    @Test
    void consumeTest() {
        Card card = cards.consumeCard();

        assertThat(cards.contains(card)).isFalse();
    }

    @Test
    void remainingCards() {
        assertThat(cards.remainingCards()).isEqualTo(CARDS_SIZE);
    }
}