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
 * @modifiedBy: Krzysztof Garbos
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            c.setValue(1);
            magicHand[i] = c;
            c.setSuit("Clubs");
            magicHand[i] = c;
        }
        Card luckyCard = new Card ();
        luckyCard.setValue(3);
        luckyCard.setSuit("Diamonds");
        
//        System.out.println("What card number do you want?");
//        int cardNumber = reader.nextInt();
//        
//        System.out.println("What is the suit of the card?");
//        String cardSuit = reader.nextLine();
//        reader.nextLine();
        
        for (Card c : magicHand) {
            if (luckyCard.getValue() == c.getValue() && c.getSuit().equals(luckyCard.getSuit())){
                System.out.println("The cards match!");
            } else {
                System.out.println("The cards don't match!");
                break;
            }
        } 
    }
}
