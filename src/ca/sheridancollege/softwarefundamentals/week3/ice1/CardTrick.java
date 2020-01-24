/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            //new card object to be generated for each card in the hand
            Card c = new Card();

            int randomValue = (int) (Math.random() * 13 + 1);
            int randomSuit = (int) (Math.random() * 3);

            c.setValue(randomValue);

            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the card trick app. 7 cards have been selected.");
        System.out.println("You are playing to see if the hand contains: Jack of Spades.");
        
        /* 
        Old edits prior to first push
        System.out.println("Please type in a card value between 1 and 13, with"
                + " 1 being an Ace, 11 being a Jack, 12 a Queen, and 13 a King.");
        int userValue = input.nextInt();
        input.nextLine(); //line so that the program doesn't skip the next prompt

        System.out.println("Please type in a suit: Hearts, Diamonds, Clubs, Spades.");
        String userSuit = input.nextLine();
        */ 

        /*
        Commented out as per #6
        user's guesses input into a new card object
        Card guess = new Card();
        guess.setValue(userValue);
        guess.setSuit(userSuit);
        */
        
        //card object created after the card's given out in class
        Card luckyCard = new Card();
        luckyCard.setValue(11);
        luckyCard.setSuit("Spades");
        
        
        boolean results = false; //variable to help keep track of the result of the for loop

        for (int j = 0; j < magicHand.length; j++) {
            if (magicHand[j].getSuit().equalsIgnoreCase("Spades") && magicHand[j].getValue() == (11)) {
                results = true;
            }
        } //end of for loop

        if (results == true) {
            System.out.println("Congratulations, the Jack of Spades is in the hand!");
        } 
        else {
            System.out.println("Sorry, the Jack of Spades isn't here :( ");
        }
    }
}
