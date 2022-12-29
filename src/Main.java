import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static String[] playersHand = new String[4];
    public static String[] computersHand = new String[4];
    public static String[] BoardHand = new String[4];


    public static void main(String[] args) {
        String[] playersHand = new String[4];
        String[] computersHand = new String[4];
        String[] BoardHand = new String[4];


        Scanner scan = new Scanner(System.in);

        String playersName;

        System.out.println("Welcome to the 'pişti' game!");

        System.out.println("Please enter your name");

        playersName = scan.next();

        System.out.println("Welcome " + playersName + " !");

        System.out.println("Cards are dealing now...");


        Deck deckCall = new Deck();
        deckCall.myDeck();
        deckCall.shuffling();
        deckCall.cutTheDeck();


//Start of the game.

            for(int i=0;i<4;i++){
                playersHand[i] = deckCall.deck[i+4];
            }
            for(int i=0;i<4;i++){
                computersHand[i] = deckCall.deck[i+4];
            }
            for(int i=0;i<4;i++){
                BoardHand[i] = deckCall.deck[i+4];
            }

        System.out.println(" ○ ○ ○ ○ Your Cards: " + playersHand[0] + " " + playersHand[1] + " " + playersHand[2] + " " + playersHand[3] + " " + "○ ○ ○ ○ " );
        System.out.println(" ");
        System.out.println(" ○ ○ ○ ○ Computer's Cards: ▇  ▇  ▇  ▇ ○ ○ ○ ○");
        System.out.println(" ");
        System.out.println(" ○ ○ ○ ○ Computer's Cards: " + computersHand[0] + " " + computersHand[1] + " " + computersHand[2] + " " + computersHand[3] + " ○ ○ ○ ○ ");
        System.out.println(" ");
        playTheCard();
    }
    public static void playTheCard(){

        System.out.println("Choose between 1 and 4 to play a card.");
        Scanner scan = new Scanner(System.in);
        int playingScan = scan.nextInt();
        if(playingScan == 1){
            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playersHand[1] + " " + playersHand[2] + " " + playersHand[3] + " " + "○ ○ ○ ○ ");

        }else if(playingScan == 2){
            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playersHand[0] + " " + playersHand[2] + " " + playersHand[3] + " " + "○ ○ ○ ○ ");

        } else if(playingScan == 3){
            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playersHand[0] + " " + playersHand[1] + " " + playersHand[3] + " " + "○ ○ ○ ○ ");

        } else if(playingScan == 4){
            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playersHand[0] + " " + playersHand[1] + " " + playersHand[2] + " " + "○ ○ ○ ○ ");
        } else {
            System.out.println("Illegal Number or Character.");
        }

    }
}
