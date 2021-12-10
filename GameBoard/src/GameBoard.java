// resource https://junilearning.com/blog/coding-projects/rock-paper-scissors-java-project/
import java.util.Scanner;

public class GameBoard {
    public static void main(String[] args) {
        //Get standard input with Java using a Scanner, or use Processing to get mouse, keyboard, or other input.
        Scanner in = new Scanner(System.in);
        // score keeper
        int wins = 0;
        int loses = 0;
        int ties = 0;


        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("MAIN MENU");
        System.out.println("================");
        System.out.println("1. Type 'play' to play");
        System.out.println("2. Type 'history' to view your game history.");
        System.out.println("3. Type 'quit' to stop playing.");
        System.out.println();

        // while loop to allow user to continue playing. For loop isn't used since we don't know


        while(true) {



        //Handle incorrect capitalization of otherwise valid user input ("rock," "Rock," "RoCk," "ROCK," and more).
        String playerMove = in.nextLine().toLowerCase();

            if(playerMove.equals("quit")) {
                break;
            }
            if(playerMove.equals("history")) {
                break;
            }
            if(playerMove.equals("play")) {
                System.out.println("Please begin the game by entering your first move. choices are rock, paper, or scissors. If you would like to quit, please enter quit.");

            }

            // validation of moves

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
              //Handle invalid user input.
                System.out.println("This is not a valid move, please chose: rock, paper or scissors");
            } else {
                //code to randomize the computer move this will generate a
                // number between 0 and 2. (int) converts it from a decimal.
                int randomMove = (int) (Math.random() * 3);
                // set it to an empty String
                String computerMove = "";
                if (randomMove == 0) {
                    computerMove = "rock";
                } else if (randomMove == 1) {
                    computerMove = "paper";
                } else {
                    computerMove = "scissors";
                }
                // string concat
                System.out.println("Computer move: " + computerMove);

                // check winning conditions
                if (playerMove.equals(computerMove)) {
                    System.out.println("It is a tie");
                    ties++;
                } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) || (playerMove.equals("paper") && computerMove.equals("rock")) || (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                    System.out.println("Winner winner chicken dinner!");
                    wins++;
                } else {
                    System.out.println("Keep your chin up Chuck, you'll get them next time!");
                    loses++;
                }
            }
            // score printout
            System.out.println("Wins: " + wins);
            System.out.println("Loses: " + loses);
            System.out.println("Ties: " + ties);
        }
        if(wins > loses ) {
            System.out.println("you won " + wins + " games and loss " + loses + " games");
        }else if(wins < loses) {
            System.out.println("you loss " + loses + " games and won " + wins);
        } else {
            System.out.println("you have " + ties + "tie games");
        }
        System.out.println("Player selected quit, please click run when you are ready to play again.");
    }

}
