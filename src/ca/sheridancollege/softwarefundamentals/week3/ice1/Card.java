package ca.sheridancollege.softwarefundamentals.week3.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @modifiedBy Diwen Zhang  StudentID:991579291
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }
    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equalsIgnoreCase("Hearts")||suit.equalsIgnoreCase("Diamonds")||suit.equalsIgnoreCase("Spades")
                ||suit.equalsIgnoreCase("Clubs"))
             {this.suit = suit;}
        else{
            throw new RuntimeException("Error: the suit is invalid.");
        }
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if(value>0 && value<14){
            this.value = value;
        }
        else{
            throw new RuntimeException("Error: the value is invalid.");
        }
    }
}
