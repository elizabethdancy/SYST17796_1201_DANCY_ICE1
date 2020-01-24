/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifiedBy Jason Li
 * @studentNumber 991455455
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please pick a card value");
        int userCardValue = input.nextInt();
        input.nextLine();
        System.out.println("Please pick a card suit");
        String userCardSuit = input.nextLine();
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            Card c = magicHand[i];
            if ((userCardValue == c.getValue()) && c.getSuit().equals(userCardSuit)) {
                //Then report the result here
                System.out.println("Your card is in the magic hand");
                break;
            } else if (i == magicHand.length - 1) {
                System.out.println("Your card is not in the magic hand");
            }
        }
    }

}
