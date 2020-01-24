/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author 991579743
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();            
            //c.setValue(insert call to random number generator here)
            c.setValue(1 + (int) Math.floor(Math.random()*13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) Math.floor(Math.random()* 4)]);
            //Assign a magicHand card
            magicHand[i] = c;
            System.out.println(magicHand[i].toString());
        }
        
        //Create a lucky card
        Card luckyCard = new Card();
        //Scanner input = new Scanner(System.in);
        
        //Create a lucky card
        //System.out.println("Please pick one card (Clubs 1): ");
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(8);
        System.out.println("The lucky card is " + luckyCard.toString());
        // and search magicHand here
        boolean checkPick = false;
        for (Card c: magicHand){
            if ((c.getValue() == luckyCard.getValue()) 
                    && (c.getSuit().equals(luckyCard.getSuit())))
                checkPick = true;
        }
        
        //Then report the result here
        if (checkPick)
            System.out.println("Wow. You got the lucky card on your hand.");
        else System.out.println("Sorry, You don't have the lucky card. You can try again.");
    }
    
}
