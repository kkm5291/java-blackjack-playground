package blackjack.domain.person;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardValue;
import blackjack.domain.card.Cards;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Hand extends Cards {

    public Hand() {
        super(new ArrayList<>());
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculateHand() {
        int sum = cards.stream()
                .mapToInt(card -> card.getCardValue().getValue())
                .sum();

        int aceCount = countAce();

        int tempSum = sum;
        sum += IntStream.range(0, aceCount)
                .filter(count -> tempSum + 10 <= 21)
                .map(count -> 10)
                .sum();
        return sum;
    }

    public int countAce() {
        return (int) cards.stream()
                .filter(card -> card.getCardValue() == CardValue.ACE)
                .count();
    }
}
