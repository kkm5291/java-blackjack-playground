package blackjack.domain.deck;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;

public class Deck {

    private Cards cards;

    public Deck() {
        cards = Cards.createDeck();
        shuffleCards();
    }

    public Cards getCards() {
        return cards;
    }

    public void shuffleCards() {
        cards.shuffle();
    }

    public Card consumeCard() {
        return cards.consumeCard();
    }
}
