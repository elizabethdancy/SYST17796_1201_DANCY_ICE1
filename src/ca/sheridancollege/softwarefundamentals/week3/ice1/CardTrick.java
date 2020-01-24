/***
 * Omar Sami
 * 991566781
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;



/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(((int) (Math.random() * 13) + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i]=c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit(spades);

        //insert code to ask the user for Card value and suit, create their card
        for (int i = 0; i < magicHand.length; i++) {
            Card c = magicHand[i];
            
            // and search magicHand here
            if ((c.getValue() == luckyCard.getValue()) && (c.getSuit().equals(luckyCard.setSuit())))
            {
                System.out.println("Your guess was right.");
            }else{
            System.out.println("Your guess is wrong.");
            
        }
            break;
            //Then report the result here
        }

    }
}
