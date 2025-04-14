package blackjack.domain.person;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardValue;
import blackjack.domain.card.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    private Hand hand;

    @BeforeEach
    void setUp() {
        hand = new Hand();
    }

    @Test
    void calculateHand() {
        hand.addCard(new Card(Shape.HEART, CardValue.FOUR));
        hand.addCard(new Card(Shape.HEART, CardValue.SIX));
        assertThat(hand.calculateHand()).isEqualTo(10);
    }

    @Test
    void calculateHandWithAce() {
        hand.addCard(new Card(Shape.HEART, CardValue.ACE));
        hand.addCard(new Card(Shape.HEART, CardValue.SIX));
        assertThat(hand.calculateHand()).isEqualTo(17);

        hand.addCard(new Card(Shape.HEART, CardValue.FIVE));
        assertThat(hand.calculateHand()).isEqualTo(12);
    }

    @Test
    void countAce() {
        hand.addCard(new Card(Shape.HEART, CardValue.ACE));
        assertThat(hand.countAce()).isEqualTo(1);
    }
}