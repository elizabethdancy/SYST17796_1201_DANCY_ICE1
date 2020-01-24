/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * Modified by Jovanka Milosevic
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        System.out.println("test");
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
           magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            c.setValue(((int) Math.random() * 12) + 1);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) Math.random() * 3]);
        }
            

        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a card value: ");
        int cardValue = input.nextInt();
        input.nextLine();
        System.out.println("Enter a card suit (Hearts,Diamonds, Spades,Clubs) : ");
        String cardSuit = input.nextLine();

        // and search magicHand here
        String message = "";
        for (int i = 0; i < magicHand.length; i++) {
            if ((cardValue == magicHand[i].getValue()) && (cardSuit.equals(magicHand[i].getSuit()))) {
                message = "You won!";
            } else {
                message = "Sorry, you were wrong. Try again.";
            }
        }

        //Then report the result here
        System.out.println(message);
    }

}
    

