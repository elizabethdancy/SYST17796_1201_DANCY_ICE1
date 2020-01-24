package ca.sheridancollege.softwarefundamentals.week3.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @modifiedBy Khang Do
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
   public Card(){
       suit = "Spades";
       value = 1;
   }
   
   public Card(String suit, int value){
       setSuit(suit);
       setValue(value);
   }
   /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) throws IllegalArgumentException{
        boolean checkSuit = false;
        for (String card: SUITS){
            if (suit.equals(card))
                checkSuit = true;
        }
        
        if (checkSuit)            
            this.suit = suit;
        else throw new IllegalArgumentException("Error: "
                + "the value should be Hearts, Diamonds, Spades, Clubs");
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
        this.value = value;
    }
        
    @Override
    public String toString(){
        return String.format("%s %d" ,suit, value);
    }
}
