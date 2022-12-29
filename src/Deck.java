import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Deck {
    public String[] deck = new String[52];
    Scanner scan = new Scanner(System.in);
    String playersName;

    public void myDeck() {

        String[] suitsOfCards = {"♠", "♣", "♥", "♦"};
        String[] ranksOfCards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < deck.length; i++) {
            if (i < 13) {
                deck[i] = suitsOfCards[0] + ranksOfCards[i];

            } else if (i >= 13 && i < 26) {

                deck[i] = suitsOfCards[1] + ranksOfCards[i % 13];

            } else if (i >= 26 && i < 39) {

                deck[i] = suitsOfCards[2] + ranksOfCards[i % 13];

            } else if (i >= 39 && i < 52) {

                deck[i] = suitsOfCards[3] + ranksOfCards[i % 13];
            }
        }
    }

    public void shuffling() {
        int firstString;
        int secondString;
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 888; i++) {
            firstString = random.nextInt(26);
            secondString = random.nextInt(26) + 26;
            String shuffled = deck[firstString];
            deck[firstString] = deck[secondString];
            deck[secondString] = shuffled;
        }
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i] + " ");

            }
        }
        public void cutTheDeck() {
            String[] copyDeck1 = Arrays.copyOfRange(deck, 0, 26);
            String[] copyDeck2 = Arrays.copyOfRange(deck, 26, 52);
            System.out.println("Deck has been cut");
            System.out.println(Arrays.toString(copyDeck1));
            System.out.println(Arrays.toString(copyDeck2));
        }
        public void dealTheCards(){
        String[] playersHand = new String[4];
        String[] computersHand = new String[4];
        String[] BoardHand = new String[4];
        for(int i=0;i<4;i++){
            deck[i]= playersHand[i];
            }
        for(int i=4;i<8;i++){
            deck[i] = computersHand[i];
            }
        for(int i=8;i<12;i++){
            deck[i] = BoardHand[i];
            }

        }


        public void display(){
            System.out.println("Please enter a card number to play");
            System.out.println("Computer is playing");
            System.out.println("Your turn to play");
            System.out.println("Congrats! You made a Pişti");
            System.out.println("That is not a valid card number");
            System.out.println("Computer made a Pişti!");
            System.out.println("○○○○○○○○○○○ Your Cards: ");

        }
}


