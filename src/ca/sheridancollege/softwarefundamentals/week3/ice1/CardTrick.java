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
 * @modifier Muhammad Aaqib Jamili. student ID #991493230
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random r = new Random();
            int num = r.nextInt(14);
            c.setValue(num);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int num1 = r.nextInt(4);
            c.setSuit(Card.SUITS[num1]);
            magicHand[i] = c;

        }
        Card luckyCard= new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(4);

        //insert code to ask the user for Card value and suit, create their card
//         System.out.println("Enter your Card Suit");
//         String userSuit = sc.nextLine();
//         System.out.println("Enter your Card Value");
//         int userValue = sc.nextInt();
//         Card c1 = new Card();
//         // and search magicHand here
//         for (int i = 0; i < magicHand.length; i++) {
//             if ((magicHand[i].getSuit().equals((userSuit))) && (magicHand[i].getValue() == (userValue))) {
//                 System.out.println("Congratulations ! you got it");

//             } else {
//                 System.out.println("Sorry, you card is not in here");
//             }
//         }
        //Then report the result here
    }
    
}
