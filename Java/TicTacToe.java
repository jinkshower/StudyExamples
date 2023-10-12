import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    static final int TURN_COUNT = 9;
    static final int ROW = 3;
    static final int COLUMN = 3;
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
            char[][] board = new char[ROW][COLUMN];
            board = populateBoard(board);
            //Task 2: Call the function printBoard();
            printBoard(board);
            //task complete
            for (int i = 0; i < TURN_COUNT; i++){
                if (i % 2 == 0){
                    System.out.println("Turn : X");
                    int [] userInput = askUser(board);
                    board[userInput[0]][userInput[1]] = 'X';
                }
                else {
                    System.out.println("Turn : O");
                    int [] userInput = askUser(board);
                    board[userInput[0]][userInput[1]] = 'O';
                }
                printBoard(board);
                if (checkWin(board) == 3) {
                    System.out.println("O wins");
                    break;
                }
                else if (checkWin(board) == -3){
                    System.out.println("X wins");
                    break;
                }
            }
              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }

                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */


            scan.close();
        }
    public static char[][] populateBoard(char[][] board){
        for (char[] chars : board) {
            Arrays.fill(chars, '_');
        }
        return board;
    }

    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        
    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print("  ");
                System.out.print(aChar);
                System.out.print(" ");
            }
            System.out.print("\n\n");
        }
    }
   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
   public static int[] askUser(char[][] board){
       System.out.print("\tpick a row and column number: ");
       int row = scan.nextInt();
       int column = scan.nextInt();
       while (board[row][column] != '_'){
           System.out.print("\tpick a row and column number: ");
           row = scan.nextInt();
           column = scan.nextInt();
       }
       return new int[] {row,column};
   }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char[][] board){
        int rows = checkRows(board);
        if ((Math.abs(rows)) == 3) return rows;

        int columns = checkColumns(board);
        if (Math.abs(columns) == 3) return columns;

        int leftDiagonal = checkLeft(board);
        if (Math.abs(leftDiagonal) == 3) return leftDiagonal;

        int rightDiagonal = checkRight(board);
        if (Math.abs(rightDiagonal) == 3) return rightDiagonal;

        return 0;
    }
    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < ROW; i++){
            for (int j = 0; j < COLUMN; j++){
                if (board[i][j] == 'O'){
                    count++;
                }
                else if (board[i][j] == 'X'){
                    count--;
                }
            }
            count = 0;
        }
        return count;
    }

    public static int checkColumns(char[][] board) {
        int count = 0;
        for (int i = 0; i < ROW; i++){
            for (int j = 0; j < COLUMN; j++){
                if (board[j][i] == 'O'){
                    count++;
                }
                else if (board[j][i] == 'X'){
                    count--;
                }
            }
            count = 0;
        }
        return count;
    }

    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < ROW; i++){
            if (board[i][i] == 'O'){
                count++;
            }
            else if (board[i][i] == 'X'){
                count--;
            }
        }
        return count;
    }

    public static int checkRight(char[][] board) {
        int count = 0;
        int j = 0;
        for (int i = 2; i > 0; i--){
            if (board[i][j] == 'O'){
                count++;
            }
            else if (board[i][j] == 'X'){
                count--;
            }
            j++;
        }
        return count;
    }

}
