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
 * Modified by Jatinder Bhachu Student# 991567886
 */
public class CardTrick {
    
    /**
     * Generates a random integer between specified range
     * @param min the minimum value
     * @param max the maximum value
     * @return a random integer
     */
    public static int genRandInt(int min, int max){
        return (int)(Math.random()*max) + min;
    }
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            // generate random number between 1 and 13
            c.setValue(genRandInt(1, 13));
            
            // generate a random number between 0 and 3
            c.setSuit(Card.SUITS[genRandInt(0, 3)]);
            // add card to the magicHand array
            magicHand[i] = c;
        }
        
        System.out.println("Please enter a Card value");
        int cardValue = in.nextInt();
        
        in.nextLine();
        
        System.out.println("Please enter a card suit");
        String cardSuit = in.nextLine();
        
        boolean foundMatch = false;
        
        
        for(int i = 0; i < magicHand.length; i++){
            // if we find a matching value and suit, print correct and break out of the loop
            if(magicHand[i].getValue() == cardValue && magicHand[i].getSuit().equalsIgnoreCase(cardSuit)){
                foundMatch = true;
                break;
            }else{
                foundMatch = false;
            }
        }
        
        if(foundMatch){
            System.out.println("Correct!");
        } else{
            System.out.println("Sorry, the card and suit you guessed weren't in the list.");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
