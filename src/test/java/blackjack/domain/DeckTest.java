package blackjack.domain;

import blackjack.domain.card.Card;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void createDeck() {
        Deck deck = new Deck();

        assertThat(deck.getCards().size()).isEqualTo(52);
    }

    @Test
    void checkCards() {
        Deck deck = new Deck();

        HashSet<Card> cardSet = new HashSet<>(deck.getCards());
        assertThat(cardSet.size()).isEqualTo(52);
    }

    @Test
    void shuffleCards() {
        Deck deck = new Deck();

        deck.shuffleCards();
        Card firstCard = deck.getCards().get(0);

        deck.shuffleCards();
        Card secondCard = deck.getCards().get(0);

        assertThat(firstCard).isNotEqualTo(secondCard);
    }

    @Test
    void consumeCard() {
        Deck deck = new Deck();

        assertThat(deck.getCards().get(0)).isEqualTo(deck.consumeCard());
    }
}