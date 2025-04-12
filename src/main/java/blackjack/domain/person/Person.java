package blackjack.domain.person;

import blackjack.domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private final List<Card> hand = new ArrayList<>();
    private int bet;

//    public int calculateHand() {
//
//    }
}
