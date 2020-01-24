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
 * @modifiedBy: MichaelHennessey
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(1);
            magicHand[i] = c;
                        
            //c.setValue(insert call to random number generator here)
            c.setSuit("Hearts");
            magicHand[i] = c;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("What card number do you want?");
//         int cardNumber = input.nextInt();
        
//         System.out.println("What is the suit of the card?");
//         String cardSuit = input.nextLine();
//         input.nextLine();
        //insert code to ask the user for Card value and suit, create their card
        for (Card c : magicHand) {
            if (c.getValue() == cardNumber && c.getSuit().equals(cardSuit)){
                System.out.println("you got a match");
            } else {
                System.out.println("You didnt get a matching card. Please draw a card.");
                break;
            }
        } // and search magicHand here
        //Then report the result here
    }
    }

