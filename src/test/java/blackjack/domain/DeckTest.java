package blackjack.domain;

import blackjack.domain.deck.Deck;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeckTest {

    @Test
    void createDeck() {
        Deck deck = new Deck();
        assertThat(deck.getCards().remainingCards()).isEqualTo(52);
    }
}