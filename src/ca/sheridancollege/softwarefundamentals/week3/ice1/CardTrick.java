package ca.sheridancollege.softwarefundamentals.week3.ice1;

import java.util.Scanner;

/**
 * @author dancye
 * @modifiedBy Mohammed Rahmoun, 991495036
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            int ranNum1 = (int) (Math.random() * 14);
            int ranNum2 = (int) (Math.random() * 4);
            Card c = new Card();
            c.setValue(ranNum1);
            c.setSuit(Card.SUITS[ranNum2]);
            magicHand[i] = c;
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        System.out.println("Enter the suit of the card:");
        String cardSuit = in.nextLine();
        System.out.println("Enter the value of the card:");
        int cardValue = in.nextInt();

        for (Card c : magicHand) {
            if (c.getValue() == cardValue && c.getSuit().equals(cardSuit)) {
                System.out.println("You won");
                break;
            } else {
                System.out.println("You lost");
                break;
            }
        }
    }

}