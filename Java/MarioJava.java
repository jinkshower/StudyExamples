import java.util.Scanner;

public class MarioJava {
    public static void main(String[] args) {
        int userInput = 0;
        do {
            userInput = getUserInput();
        } while(userInput < 1 || userInput > 8);
        printMario(userInput);
    }
    public static int getUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Height: ");
        return scan.nextInt();
    }
    public static void printMario(int userInput){
        int row = 1;
        for (int i = 0; i < userInput; i++){
            for (int k = 0; k < userInput - row; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <row; j++){
                System.out.print("#");
            }
            System.out.print(" ");
            for (int m = 0; m < row; m++){
                System.out.print("#");
            }
            System.out.print("\n");
            row++;
        }
    }
}
