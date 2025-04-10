package blackjack.domain.card;

public class Card {

    private Shape shape;
    private CardValue cardValue;

    public Card(Shape shape, CardValue cardValue) {
        this.shape = shape;
        this.cardValue = cardValue;
    }
}
