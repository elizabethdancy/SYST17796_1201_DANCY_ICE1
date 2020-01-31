package ca.sheridancollege.softwarefundamentals.week3.ice1;

/**
 * @author dancye
 * @modifiedBy Mohammed Rahmoun, 991495036
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   
   public static final String [] SUITS = {"Hearts", "Diamonds",
       "Spades", "Clubs"};
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
        this.suit = suit;
    }
    
   
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
   
  