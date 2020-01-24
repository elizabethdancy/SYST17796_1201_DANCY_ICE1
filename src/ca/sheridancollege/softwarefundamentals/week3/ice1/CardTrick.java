/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * Author: Allanah Brisebois
 * Student ID: 991479940
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Scanner scr = new Scanner(System.in);
        int i=0;
        for (i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13));
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suit = rand.nextInt(4);
                c.setSuit(Card.Suits[suit]);
            
            c.setSuit(suit);
           
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter card value:");
        int value = sc.nextInt();
        
        
        Card luckyCard = new Card("Spades", 4);
        
        System.out.println("Please enter a suit: ");
        String suit = scr.nextLine();
        
        Card d = new Card(suit, value);
        // and search magicHand here
        Card c = magicHand[i];
        if((c.getValue() == value) && c.getSuit().equals(suit)){
            System.out.println("You picked the magic card!");
        }else{
            System.out.println("You did not pick the magic card");
        }
        
        //Then report the result here
       
    }
    
}
