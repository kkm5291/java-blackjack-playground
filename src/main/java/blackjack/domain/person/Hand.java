package blackjack.domain.person;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardValue;
import blackjack.domain.card.Cards;
import java.util.ArrayList;

public class Hand extends Cards {

    public Hand() {
        super(new ArrayList<>());
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculateHand() {
        //todo stream 으로 변환시켜야 함.
        int sum = 0;

        for (Card card : cards) {
            sum += card.getCardValue().getValues()[0];
        }

        int aceCount = countAce();
        if (aceCount > 0) {

            while (aceCount > 0) {
                if (sum + 10 <= 21) {
                    sum += 10;
                }
                aceCount--;
            }
        }
        return sum;
    }

    public int countAce() {
        return (int) cards.stream()
                .filter(card -> card.getCardValue() == CardValue.ACE)
                .count();
    }
}
