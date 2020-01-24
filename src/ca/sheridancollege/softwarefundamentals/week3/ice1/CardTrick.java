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
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(((int)Math.random()* 12) + 1);
            c.setSuit(Card.SUITS[((int)Math.random()*3)]);
            magicHand[i] = c;
        }
        
        
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckCard.setSuit("Hearts");
        
        for(int i = 0; i < magicHand.length; i++){
            if(luckCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit()){
                System.out.println("Match");
            }
               else
               {
                   System.out.println("No match");
               }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
//         int cardNumber;
//         String suit;
//         System.out.println("Enter card number");
//         Scanner card = new Scanner(System.in);
//         cardNumber = card.nextInt();
       
//        Scanner cardsuit = new Scanner(System.in);
//        System.out.println("Enter suit");
//         suit = cardsuit.nextLine();
//         System.out.println();
        
//         for(int i = 0; i < magicHand.length; i++){
//             if (cardNumber == magicHand[i].getValue() && suit.equals(magicHand[i].getSuit())){
//                 System.out.println("Match");
//             }
//             else
//             {
//                 System.out.println("No match");
//             }
            
//             }
        
        
    }
    
}
