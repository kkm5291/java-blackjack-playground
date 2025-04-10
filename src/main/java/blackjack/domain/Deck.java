package blackjack.domain;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardValue;
import blackjack.domain.card.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        cards = createDeck();
    }

    private List<Card> createDeck() {
        return Arrays.stream(Shape.values())
                .flatMap(s -> Arrays.stream(CardValue.values())
                        .map(cv -> new Card(s, cv))
                ).collect(Collectors.toList());
    }

    private void shuffleCards() {
        Collections.shuffle(cards);
    }
}
