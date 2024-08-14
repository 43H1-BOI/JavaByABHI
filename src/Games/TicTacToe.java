package Games;

import java.util.Scanner;

public class TicTacToe {
    static Scanner Sc = new Scanner(System.in);

    // Stores Successful Moves of game
    static players[][] SuccessMoves = new players[3][3];

    // Stores player 1 and player 2 info
    static players p1, p2;

    // Contains Players
    enum players {
        Invalid, // Not a Valid Player
        X, // Player X
        O; // Player O
    }

    static void Board(players[][] SuccessMoves, int cord1, int cord2) {
        cord1--;
        cord2--;
        if (SuccessMoves[cord1][cord2] == players.Invalid) {
            System.out.println("Invalid Move");
        } else {
            SuccessMoves[cord1][cord2] = p1;
        }

        /*

        System.out.println(" 1,1 │ 1,2 │ 1,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 2,1 │ 2,2 │ 2,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 3,1 │ 3,2 │ 3,3 ");

        The below one is Systematic Form of Above Board

        */

        System.out.println(" " + SuccessMoves[0][0] + " │ " + SuccessMoves[0][1] + " │ " + SuccessMoves[0][2] + " ");
        System.out.println("———¦———¦———");
        System.out.println(" " + SuccessMoves[1][0] + " │ " + SuccessMoves[1][1] + " │ " + SuccessMoves[1][2] + " ");
        System.out.println("———¦———¦———");
        System.out.println(" " + SuccessMoves[2][0] + " │ " + SuccessMoves[2][1] + " │ " + SuccessMoves[2][2] + " ");


        /*
        // Typical X O Board
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");
        System.out.println("————¦————¦————");
        System.out.println("    │    │   ");
        */

    }

    public static void main(String[] args) {
        System.out.println("Tic Tac Toe Game : \n\n");
//        players p1, p2;
        int choice = 0;

        // For Selection of Player
        while (choice != 3) {
            System.out.println("Enter 1 To Select X.");
            System.out.println("Enter 2 To Select 0.");
            System.out.println("Enter 3 To Exit Game.\n");

            System.out.println("Select Your Choice :");
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    p1 = players.X;
                    System.out.println("You Selected X.");
                    p2 = players.O;
                    break;
                case 2:
                    p1 = players.O;
                    System.out.println("You Selected O.");
                    p2 = players.X;
                    break;
                case 3:
                    System.out.println("Thanks For Playing ;)");
                    break;
                default:
                    System.out.println("Invalid Choice !");
                    System.out.println("Please Select From Given Options : ");
            }
            if (choice == 1 || choice == 2) break;
        }

        // To End Program if the user enters 3 ( To Exit Game )
        if (choice == 3) return;

        System.out.println("Let's Go Buddy !\n");


        // SuccessMoves counts the Successful Moves Entered by Player
        // If He/She Enters the coordinates where one player is already present then it will not be counted as successful move
        // SuccessMoves Array Contains the GameBoard

        // Now this
//        players[][] SuccessMoves = new players[3][3];
        int[][] Moves = new int[3][3];

        System.out.println(" 1,1 │ 1,2 │ 1,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 2,1 │ 2,2 │ 2,3 ");
        System.out.println("—————¦—————¦—————");
        System.out.println(" 3,1 │ 3,2 │ 3,3 ");

        System.out.println("Enter Your Move in Given Coordinate Form :  ");
        int cord1 = Sc.nextInt();
        int cord2 = Sc.nextInt();

        Board(SuccessMoves, cord1, cord2);

    }
}
