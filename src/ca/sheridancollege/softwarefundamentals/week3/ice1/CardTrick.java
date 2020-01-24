/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Xian Qin 991 578 381
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
        
        Card LuckyCard = new Card();
        LuckyCard.setValue(7);
        LuckyCard.setSuit("Spades");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int ran1 = (int)(Math.floor((Math.random()*13)+1));
            
            c.setValue(ran1);
            
            int ran2 = (int)(Math.floor(Math.random()*4));
            
            c.setSuit(Card.SUITS[ran2]);
            
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + magicHand[i].getSuit());
        }
        
        
        
        
        
        //insert code to ask the user for Card value and suit, create their card
//         System.out.println("Please enter the Card Value: (1-13) >");
//         Scanner scan1 = new Scanner(System.in);        
//         int value = scan1.nextInt();
//         Scanner scan2 = new Scanner(System.in);   
//         System.out.println("Please enter the suit: >");
//         String suit = scan2.nextLine();
        
        // and search magicHand here
        
        Boolean win = false;
        for (int i=0; i<magicHand.length; i++) {
            
            if (value == magicHand[i].getValue() 
             && suit.equalsIgnoreCase(magicHand[i].getSuit())  )
            {
                win = true;
            }
        }   
        //Then report the result here
        if (win){
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Try Again!");
        }
        
        
    }
    
}
