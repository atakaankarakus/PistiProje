import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String playersName;

        System.out.println("Welcome to the 'pişti' game!");

        System.out.println("Please enter your name");

        playersName = scan.next();

        System.out.println("Welcome " + playersName + " !");

        System.out.println("Cards are dealing now");


        Deck deckCall = new Deck();
        deckCall.myDeck();

        System.out.println("○○○○○○○○○○○ Your Cards: ");

//Start of the game.
            String[] playersHand = new String[4];
            String[] computersHand = new String[4];
            String[] BoardHand = new String[4];
            for(int i=0;i<4;i++){
                playersHand[i] = deckCall.deck[i+4];
            }
            for(int i=0;i<4;i++){
                computersHand[i] = deckCall.deck[i+4];
            }
            for(int i=0;i<4;i++){
                BoardHand[i] = deckCall.deck[i+4];
            }







    }
}