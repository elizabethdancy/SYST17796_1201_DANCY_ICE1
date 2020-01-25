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
 * modified by: Lina Shalabi
 * 991497583
 */

public class CardTrick {
    
    public static void main(String[] args)
    { 
            Card c= new Card();
            Scanner sc = new Scanner(System.in); 
            int value;
            
             Card[] magicHand = new Card[7];
      
             for (int i=0; i<magicHand.length; i++){
        
            magicHand[i] = c;}
             String random = (Card.SUITS[new Random().nextInt()]);
             c.setSuit(random);
             
             value = (int) (Math.random() *12 +1);
             c.setValue(value);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            System.out.println("Enter a card value: ");
            int userValue = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a suit: ");
            String userSuit = sc.nextLine();
            
            String message="";
            for(Card magicHand1 : magicHand){
            if(( userValue== magicHand1.getValue()))
                        message = "you won! this is your lucky day!";
            
            else
                    message = "Try again";
         
        }
       
    }
}   

