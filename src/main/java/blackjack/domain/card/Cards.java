package blackjack.domain.card;

import java.util.*;

public abstract class Cards {

    protected List<Card> cards;

    protected Cards(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards1 = (Cards) o;
        return Objects.equals(cards, cards1.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cards);
    }
}
