package blackjack.domain.card;

import java.util.*;
import java.util.stream.Collectors;

public class Cards {

    private List<Card> cards;

    Cards(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public static Cards createDeck () {
        return new Cards(Arrays.stream(Shape.values())
                .flatMap(s -> Arrays.stream(CardValue.values())
                        .map(cv -> new Card(s, cv))
                ).collect(Collectors.toList())
        );
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card consumeCard() {
        return cards.remove(0);
    }

    public int remainingCards() {
        return cards.size();
    }

    public boolean contains(Card card) {
        return cards.contains(card);
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
