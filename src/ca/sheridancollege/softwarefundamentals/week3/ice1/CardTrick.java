/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifiedBy by Maiziel Serrao(991567509)
 */
public class CardTrick {

    public static void main(String[] args) {
         boolean winner = false;
         
        do {
            Card[] magicHand = new Card[7];
            Scanner scan = new Scanner(System.in);

            for (int i = 0; i < magicHand.length; i++) {
                Card c = new Card();
                c.setValue(((int) (Math.random() * 12)) + 1);
                c.setSuit(Card.SUITS[((int)Math.random()*3)]);
                magicHand[i]=c;
            }

            //insert code to ask the user for Card value and suit, create their card
            System.out.println("Pick a card, any card!");
            System.out.println("What is your desired card value?");
            int cardValue = scan.nextInt();

            System.out.println("\nWhat is your desired card suit?"
                    + "(Hearts, Diamonds, Spades, Clubs)");
            
            scan.next();
            
            String cardSuit = new String("");
            cardSuit = scan.nextLine().toLowerCase();

           
            // and search magicHand here
            for (int i = 0; i < magicHand.length; i++) {
                if ((cardValue == magicHand[i].getValue()) && (cardSuit.equals(magicHand[i].getSuit().toLowerCase()))) {
                    winner = true;
                }
            }

            //Then report the result here
            if (winner) {
                System.out.println("Congrats! You won!");
            } else {
                System.out.println("Sorry, try again!");
            }
        } while (!winner);
    }

    

}
