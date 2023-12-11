package PockerGame;

import java.util.Arrays;

public class PokerApp {

    public static void main(String[] args) {


        Cards cards = new Cards();
        DeckService service = new DeckService();

        //System.out.println(Arrays.toString(cards.getDeck()));

        service.fillDeck(cards.getDeck());

        System.out.println(Arrays.toString(cards.getDeck()));

        Card[] deckShuffle = service.deckShuffle(cards.getDeck());

        System.out.println(Arrays.toString(deckShuffle));

        System.out.println();

        deckShuffle = service.deckShuffle(deckShuffle);

        System.out.println(Arrays.toString(deckShuffle));

    }
}
