/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;
import java.util.Random;
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
        
        Scanner input= new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Random r = new Random();
        int num= r.nextInt(14);
        int num2= r.nextInt(4);
        int num3=0;
        String s;
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            
            //c.setValue(insert call to random number generator here)
            c.setValue(num);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
           c.setSuit(Card.SUITS[num2]);
            
            
        }
        Card userCard= new Card();
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter Card Value");
        num3=input.nextInt();
        userCard.setValue(num3);
        System.out.println("Please enter Card Suit");
        s=input.nextLine();
        userCard.setSuit(s);
        // and search magicHand here
        if(userCard.getValue()==c.getValue()&&userCard.getSuit().equals(c.getSuit()))
        
        //Then report the result here
    }
    
}
