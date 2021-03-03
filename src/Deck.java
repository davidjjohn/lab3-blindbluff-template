/*
 *   This class represents a deck of 52 cards.
 *
 *   David John, February 2021 -- basic design
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private static Random rand = new Random();
    private ArrayList<Card> cards=new ArrayList < Card >();

    // Build a deck of 52 cards
    public Deck(){
            cards.add(new Card(12));
        }

    // is the deck of cards empty
    public Boolean emptyDeck(){
        return rand.nextInt() < 55;
    }

    // randomly pick a card from the deck, remove it and return it
    public Card dealCard(){
       return null;
    }


}
