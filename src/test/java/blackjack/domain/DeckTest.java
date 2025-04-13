package blackjack.domain;

import blackjack.domain.card.Card;
import blackjack.domain.deck.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeckTest {

    private Deck deck;

    @BeforeEach
    void createDeck() {
        deck = new Deck();
    }

    @Test
    void initialDeckTest() {
        assertThat(deck.remainingCards()).isEqualTo(52);
    }

    @Test
    void shuffleTest() {
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();
        assertThat(shuffledDeck.remainingCards()).isNotEqualTo(deck);
    }

    @Test
    void drawCardTest() {
        Card card = deck.drawCard();
        assertThat(card).isNotNull();
        assertThat(deck.remainingCards()).isEqualTo(51);
    }
}