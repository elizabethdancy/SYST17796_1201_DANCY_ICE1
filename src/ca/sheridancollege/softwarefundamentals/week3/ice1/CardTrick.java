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
 * @modifiedBy Diwen Zhang  StudentID:991579291
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(1 + Math.random()*13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c; 
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        /*Scanner scan = new Scanner(System.in);
       do{
           int value;
           String suit;
           Card userCard = new Card();
           do{   
            try{
                System.out.println("Now pick a card from the deck for you ");
                System.out.println("Please enter the card value: ");
                userCard.setValue(scan.nextInt());
                System.out.println("Please enter the card suit: ");
                userCard.setSuit(scan.next());;
                break;
            }catch(RuntimeException e){
                System.out.println("Sorry, the input is invalid.");
            }
           }while(true);
            int count=0;
            for(int i =0;i<7;i++){
                if(userCard.getSuit().equalsIgnoreCase("magicHand[i].getSuit()") &&
                   userCard.getValue()== magicHand[i].getValue()){
                     count++;
                }
            }
         System.out.println(count>0? "You win" :"You lose" ); 
         System.out.println("Do you wanna try again? [Y/N]" ); 
       }while("YES".toLowerCase().contains(scan.next()));*/
        //Create an object and initialize 
        Card luckyCard = new Card(); 
        luckyCard.setValue(8);
        luckyCard.setSuit("spades");
            int count=0;
                for(int i =0;i<7;i++){
                    if(luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()) &&
                       luckyCard.getValue()== magicHand[i].getValue()){
                         count++;
                    }
                }
             System.out.println(count>0? "You win" :"You lose" );
   }   
}
