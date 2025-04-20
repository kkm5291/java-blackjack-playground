package blackjack.domain.person;

import blackjack.domain.card.Card;
import blackjack.domain.deck.Deck;

public abstract class Person {
    protected String name;
    protected Hand hand;
    protected int bet;

    protected Person(String name) {
        this.name = name;
        this.hand = new Hand();
        this.bet = 0;
    }

    //todo openCardFromHand 부분 추가해야 함.
    abstract public void openCardFromHand();

    public int checkHand() {
        return hand.calculateHand();
    }

    public void drawCard(Deck deck) {
        Card card = deck.drawCard();
        hand.addCard(card);
    }

    public void initBet(int money) {
        this.bet = money;
    }

    public String getName() {
        return name;
    }
}
