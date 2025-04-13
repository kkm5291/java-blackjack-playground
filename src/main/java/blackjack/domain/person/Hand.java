package blackjack.domain.person;

import blackjack.domain.card.Card;
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
        //todo 해당 메서드 구현해야 함 (ACE 고려해서)
        return 0;
    }
}
