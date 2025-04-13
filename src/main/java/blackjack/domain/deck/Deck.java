package blackjack.domain.deck;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardValue;
import blackjack.domain.card.Cards;
import blackjack.domain.card.Shape;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck extends Cards {

    public Deck() {
        super(createDeck());
    }

    private static List<Card> createDeck() {
        return Arrays.stream(Shape.values())
                .flatMap(shape -> Arrays.stream(CardValue.values())
                        .map(value -> new Card(shape, value)))
                .collect(Collectors.toList());
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int remainingCards() {
        return cards.size();
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}
