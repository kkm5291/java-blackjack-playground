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
        return cards.stream()
                .reduce(0, (a, b) -> a + b.getCardValue().getValues()[0], Integer::sum);
    }
}
