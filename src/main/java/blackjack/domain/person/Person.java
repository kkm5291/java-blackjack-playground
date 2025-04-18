package blackjack.domain.person;

import blackjack.domain.card.Card;
import blackjack.domain.deck.Deck;

public abstract class Person {
    private String name;
    private Hand hand;
    private int bet;

    public Person(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public int checkHand() {
        return hand.calculateHand();
    }

    public void drawCard(Deck deck) {
        Card card = deck.drawCard();
        hand.addCard(card);
    }
}
