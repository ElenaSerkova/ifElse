package PockerGame;

public class Cards {
    private Card[] deck = new Card[52];

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }
}
