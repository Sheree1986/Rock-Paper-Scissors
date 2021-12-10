// resource https://junilearning.com/blog/coding-projects/rock-paper-scissors-java-project/
import java.util.Scanner;

public class GameBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // while loop to allow user to continue playing. For loop isn't used since we don't know
        // amount of moves

        while(true) {
        System.out.println("Please begin the game by entering your first move. choices are rock, paper, or scissors. If you would like to quit, please enter quit.");
        String playerMove = in.nextLine();
            if(playerMove.equals("quit")) {
                break;
            }

            // validation of moves
            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("This is not a valid move, please chose: rock, paper or scissors");
            } else {
                //code to randomize the computer move this will generate a
                // number between 0 and 2. (int) converts it from a decimal.
                int randomMove = (int) (Math.random() * 3);
                // set it to an empty String
                String player2Move = "";
                if (randomMove == 0) {
                    player2Move = "rock";
                } else if (randomMove == 1) {
                    player2Move = "paper";
                } else {
                    player2Move = "scissors";
                }
                // string concat
                System.out.println("Player 2 move: " + player2Move);

                // check winning conditions
                if (playerMove.equals(player2Move)) {
                    System.out.println("It is a tie");
                } else if ((playerMove.equals("rock") && player2Move.equals("scissors")) || (playerMove.equals("paper") && player2Move.equals("rock")) || (playerMove.equals("scissors") && player2Move.equals("paper"))) {
                    System.out.println("Winner winner chicken dinner!");
                } else {
                    System.out.println("Keep your chin up Chuck, you'll get them next time!");
                }
            }
        }
        System.out.println("Player selected quit, please click run when you are ready to play again.");
    }

}