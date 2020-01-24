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
 * @author 991579743
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();            
            //c.setValue(insert call to random number generator here)
            c.setValue(1 + (int) Math.floor(Math.random()*13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) Math.floor(Math.random()* 4)]);
            //Assign a magicHand card
            magicHand[i] = c;
        }
        
        Card cardPick = new Card();
        Scanner input = new Scanner(System.in);
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please pick one card (Clubs 1): ");
        cardPick.setSuit(input.next());
        cardPick.setValue(input.nextInt());
        
        // and search magicHand here
        boolean checkPick = false;
        for (Card c: magicHand){
            if (c.equals(cardPick))
                checkPick = true;
        }
        
        //Then report the result here
        if (checkPick)
            System.out.println("Wow. You're right. You're a magician.");
        else System.out.println("Sorry, it's not correct. You can try again.");
    }
    
}
