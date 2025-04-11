package blackjack.domain.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {

    private List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
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

    public static Cards createDeck() {
        return new Cards(Arrays.stream(Shape.values())
                .flatMap(s -> Arrays.stream(CardValue.values())
                        .map(cv -> new Card(s, cv))
                ).collect(Collectors.toList())
        );
    }
}
