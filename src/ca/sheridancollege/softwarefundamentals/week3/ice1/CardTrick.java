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
 * @modifier Parneet Kaur
 * Student Number= 991589127
 */
public class CardTrick {
   
    
    public static void main(String[] args)
    {
         Scanner sc = new Scanner (System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random r = new Random();
            int num = r.nextInt(14);
            c.setValue(num);
             magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            int num1 = r.nextInt(4);            
            c.setSuit(Card.SUITS[num1]); 
            magicHand[i]=c;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
       
       
       Card luckyCard = new Card();
       luckyCard.setValue(5);
       luckyCard.setSuit("Diamonds");
       
        for (int i=0; i<magicHand.length; i++)
      {
          if ((magicHand[i].getValue()==5)&&(magicHand[i].getSuit().equals("Diamonds")))
                  {
                     System.out.println("Wow! You won");
                  }
          else
          {
              System.out.println("Sorry, You lost it.");
             
          }
       }
       
//         System.out.println("please enter the value of your card");
//         int answer = sc.nextInt();
//          System.out.println("please enter the suit of your card");
//         String answer1 = sc.nextLine();
//         Card diamondFive = new Card();
        
//       for (int i=0; i<magicHand.length; i++)
//       {
//          if ((magicHand[i].getValue()==answer)&&(magicHand[i].getSuit().equals(answer1)))
//                  {
//                     System.out.println("Wow! You won");
//                  }
//          else
//          {
//              System.out.println("Sorry, You lost it.");
             
//          }
//       }
    }
}
        
      
    

