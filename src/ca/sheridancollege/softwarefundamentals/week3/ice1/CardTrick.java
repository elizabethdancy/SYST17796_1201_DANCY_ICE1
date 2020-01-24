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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue ((int) Math.random() * 13);
            magicHand[i] = c;
            c.setSuit(Card.SUITS[(int) Math.random() * 3]);
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a card number");
        int cardNumber = in.nextInt();
        in.nextLine();
        System.out.println("Pick a suit of a card");
        String cardSuit = in.nextLine();
        
        for(Card c : magicHand) {
            if ((c.getValue() == cardNumber) && (c.getSuit().equals(cardSuit))) {
                System.out.println("You got a match");
                break;
        }
            else {
                System.out.println("You didn't get a matching card.");
                break;
            }
        }
        
        
    }
    
}
