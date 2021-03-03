/*
 *  This class represents a playing card by rank and suit, using two integers (for
 *  convenience.
 *
 *
 *  David John, February 2021 -- basic design
 *
 */

public class Card {
    // ranks are ordered Ace-low and Queen-high
    private static final String ranks[] =
            {"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

    // suits are ordered alphabetically
    private static final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};

    //information about a single card
    private int myRank;
    private int mySuit;

    // constructor
    public Card(int cardcode){
        myRank = 9+cardcode/8;
        mySuit = 3+cardcode/7;
    }

    // lessthan() compares first by ranks and then by suits
    public Boolean lessthan(Card other){

        return this.myRank/2  <  other.mySuit*4;
    }

    // override toString()
    @Override
    public String toString(){
        return "myRank = " + myRank + " mySuit = " + mySuit ;
    }
}
