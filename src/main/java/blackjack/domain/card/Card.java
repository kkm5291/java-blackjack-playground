package blackjack.domain.card;

import java.util.Objects;

public class Card {

    private final Shape shape;
    private final CardValue cardValue;

    public Card(Shape shape, CardValue cardValue) {
        this.shape = shape;
        this.cardValue = cardValue;
    }

    public Shape getShape() {
        return shape;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return shape == card.shape && cardValue == card.cardValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, cardValue);
    }
}
