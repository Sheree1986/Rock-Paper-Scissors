import java.util.Scanner;

public class GameBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please begin the game by entering your first move. choices are rock, paper, or scissors: ");
        String playerMove = in.nextLine();


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
        }
    }
    }

