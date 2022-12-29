import java.util.Scanner;


public class Main {
    public static String[] playerHand = new String[4];
    public static String[] computerHand = new String[4];
    public static String[] boardHand = new String[4];


    public static void main(String[] args) {



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
                playerHand[i] = deckCall.deck[i+4];
            }
            for(int i=0;i<4;i++){
                computerHand[i] = deckCall.deck[i+4];
            }
            for(int i=0;i<4;i++){
                boardHand[i] = deckCall.deck[i+4];
            }

        System.out.println(" ○ ○ ○ ○ Your Cards: " + playerHand[0] + " " + playerHand[1] + " " + playerHand[2] + " " + playerHand[3] + " " + "○ ○ ○ ○ " );

        System.out.println(" ");

        System.out.println(" ○ ○ ○ ○ Computer's Cards: ▇  ▇  ▇  ▇ ○ ○ ○ ○");

        System.out.println(" ");

        System.out.println(" ○ ○ ○ ○ Computer's Cards: " + computerHand[0] + " " + computerHand[1] + " " + computerHand[2] + " " + computerHand[3] + " ○ ○ ○ ○ ");

        System.out.println(" ");

        playTheCard();
    }
    public static void playTheCard(){

        System.out.println("Choose between 0 to 3 to play a card.");

        Scanner scan = new Scanner(System.in);

        int playingScan = scan.nextInt();

        if(playingScan == 0){

            boardHand[0]=playerHand[playingScan];

            playerHand[playingScan] = null;

            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playerHand[1] + " " + playerHand[2] + " " + playerHand[3] + " " + "○ ○ ○ ○ ");


        }else if(playingScan == 1){
            boardHand[1]=playerHand[playingScan];

            playerHand[playingScan] = null;

            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playerHand[0] + " " + playerHand[2] + " " + playerHand[3] + " " + "○ ○ ○ ○ ");


        } else if(playingScan == 2){
            boardHand[2]=playerHand[playingScan];

            playerHand[playingScan] = null;

            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playerHand[0] + " " + playerHand[1] + " " + playerHand[3] + " " + "○ ○ ○ ○ ");


        } else if(playingScan == 3){
            boardHand[3]=playerHand[playingScan];

            playerHand[playingScan] = null;

            System.out.println(" ○ ○ ○ ○ Your Cards: "  + " " + playerHand[0] + " " + playerHand[1] + " " + playerHand[2] + " " + "○ ○ ○ ○ ");

        } else {
            System.out.println("Illegal Number or Character.");
        }


    }
}
