/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifiedBy chowdsan 991560171
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue(((int) Math.random() * 12) + 1);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[((int) Math.random() * 3)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        //System.out.println("Enter a card number: ");
        //int cardNum = input.nextInt();
        //input.nextLine();

        //System.out.println("Enter a suit: ");
        //String cardSuit = input.nextLine();

        // and search magicHand here
        //String report = "";

        //for (int j = 0; j < magicHand.length; j++) {
        //    if ((cardNum == magicHand[j].getValue()) && (cardSuit.equals(magicHand[j].getSuit()))) {
        //        report = "Congratulations!";
        //    } else {
        //        report = "Your card is not in the magic hand of cards!";
        //    }
        //}
        
        card luckyCard = new Card();
        luckyCard setValue(3);
        luckyCard setSuit("Hearts");
        
        String report = "";
        for (int k = 0; k < magicHand.length; k++) {
            if (luckyCard.getValue() == magicHand[i].getValue()) && (luckyCard.getSuit.equals(magicHand[i].getSuit())) {
                report = "Your card has been chosen!";
            } else {
                report = "Your card hasn't been chosen. Try again!";
            }
        }
        
        //Then report the result here
        
        System.out.println("report");
    }

}
