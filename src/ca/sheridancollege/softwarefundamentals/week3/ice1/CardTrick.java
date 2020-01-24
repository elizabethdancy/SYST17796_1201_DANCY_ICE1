/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

import static ca.sheridancollege.softwarefundamentals.week3.ice1.Card.SUITS;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy HsiaoHsienKuo 991562344
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suitIndex = (int)((Math.random())*4);
            c.setSuit(SUITS[suitIndex]);
            
            int colorIndex = (int)((Math.random())*13+1);
            c.setValue(colorIndex);
            
            magicHand[i]=c;
//            System.out.println(c.getSuit()+" "+c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card cPick = new Card();
        
        System.out.println("Tell me your cad number?");
        int x = input.nextInt();
        System.out.println("Tell me your cad type? Please enter Hearts, Diamonds, "
        + "Spades, Clubs");
        
        input.nextLine();
        String y = input.nextLine();
        
        cPick.setValue(x);
        cPick.setSuit(y);
        //System.out.println(cPick.getSuit()+" "+cPick.getValue());

        // and search magicHand here
        System.out.println("So, in my magic hand, let me see if you are lucky?");
        
        int count=0;
        for (int i=0; i<magicHand.length; i++){
            if(magicHand[i].getSuit().equals(cPick.getSuit())&&(magicHand[i].getValue() == cPick.getValue())){
                count++;
            }
        }
        
        if(count==0){
            System.out.println("You lose!");
        }
        else{
            System.out.println("You are lucky!");
        }

        
    }
}
