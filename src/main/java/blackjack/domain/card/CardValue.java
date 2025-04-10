package blackjack.domain.card;

public enum CardValue {
    ACE(new int[]{1, 11}),
    TWO(new int[]{2}),
    THREE(new int[]{3}),
    FOUR(new int[]{4}),
    FIVE(new int[]{5}),
    SIX(new int[]{6}),
    SEVEN(new int[]{7}),
    EIGHT(new int[]{8}),
    NINE(new int[]{9}),
    TEN(new int[]{10}),
    JACK(new int[]{10}),
    QUEEN(new int[]{10}),
    KING(new int[]{10});

    private final int[] values;

    CardValue(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }
}
