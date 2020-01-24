/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * Modified by Michael Delcore, 991588388
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int randValue = (int)(Math.random() * 13 + 1);
            int randSuit = (int)(Math.random() * 4);
            
            c.setValue(randValue);
            
            c.setSuit(Card.SUITS[randSuit]);
                    
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        
        // I couldn't remember the exact suit of the card
        luckyCard.setSuit("Hearts");
        
//         Scanner in = new Scanner(System.in);
        
//         System.out.println("Please insert your card value guess (Between 1(Ace) and 13(King))");
//         int guessValue = in.nextInt();
        
//         in.nextLine();
//         System.out.println("Please type in either Hearts, Diamonds, Spades, Clubs");
//         String guessSuit = in.nextLine();
        
//         Card user = new Card();
//         user.setValue(guessValue);
//         user.setSuit(guessSuit);
        int countWin = 0;
        
        for (int i=0; i<magicHand.length; i++) {
            if ((magicHand[i].getValue()) == (luckyCard.getValue())) {
                if ((magicHand[i].getSuit()).equals(luckyCard.getSuit())) {
                    countWin += 1;
                }
            }
        }
        
        if (countWin >= 1) {
                System.out.println("You won!");
            }
        else {
            System.out.println("Sorry, none of the cards matched!");
        }
    }
}
