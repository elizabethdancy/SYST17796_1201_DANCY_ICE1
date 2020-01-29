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
 * @author dancye, 2020 test comment
 * @author Hoda Abokhadra , ID: 991578255
 */
import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card c = new Card();
        Card luckyCard = new Card();
        Card[] magicHand = new Card[7];
        Random r = new Random();        
        int value = r.nextInt(13);
        value +=1;
        c.setValue(value);
       luckyCard.setValue(4);
       luckyCard.setSuit("Hearts");
        String suit = (Card.SUITS[r.nextInt(c.SUITS.length)]) ;
        c.setSuit(suit);
        
        Scanner input = new Scanner(System.in);
     
        for (int i=0; i< magicHand.length; i++){
            
           magicHand[i] = c;
        }
        System.out.println("Please enter a suit: ");
        String s = input.nextLine();
        
       System.out.println("Please enter a number: ");   
         int randomInt = input.nextInt();
          
       
          if (s == luckyCard.getSuit() && randomInt == luckyCard.getValue()){
              
              System.out.print("What a luck! you WIN!!");
          }
              else { 
              System.out.println("Good luck next time. ");
                      }
           
        }
        
       
        
        
        
    }
    
    

