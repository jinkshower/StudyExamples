import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {
    /** choose a random word and populate the array with '_'
     *  user gets same turn with the length of a random word
     *  show gallows with each turn max - turn
     *  show correct/ wrong guesses
     *      if correct populate _ array
     *      if wrong in new line display their guess
     *  win condition
     *      -user complete _ array within their given turns
     *  lose condition
     *      -user used all of the turn and hasn't turned hasWon.
     *
     */

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        String answer = getRandomWord();
        char[] tempArray = createPlaceHolders(answer);
        int maxTurn = tempArray.length;
        boolean hasWon = false;

        hasWon = gameLoop(tempArray, answer, maxTurn);
        exitMessage(hasWon, answer);
    }
    public static boolean gameLoop(char[] tempArray,String answer, int maxTurn){
        int currentTurn = maxTurn;
        ArrayList<Character> missArray = new ArrayList<>();
        char userInput = ' ';
        char[] gameArray = Arrays.copyOf(tempArray, tempArray.length);
        boolean hasWon = false;

        for (int i = 0; i < maxTurn; i++){

            if (winCheck(gameArray)){
                hasWon = true;
                printArray(gameArray);
                break;
            }

            printGallows(currentTurn);
            printArray(gameArray);
            printMisses(missArray);
            userInput = getUserGuess();

            if (checkGuess(userInput, answer)) {
                gameArray = updatePlaceholders(gameArray, answer ,userInput);
                maxTurn++;
            }
            if (!checkGuess(userInput, answer)) {
                missArray.add(userInput);
                currentTurn--;
            }
        }

        return hasWon;
    }

    public static boolean winCheck(char[] gameArray){
        boolean winCheck = true;
        for (char a: gameArray){
            if (a == '_') {
                winCheck = false;
            }
        }
        return winCheck;
    }

    public static char[] updatePlaceholders(char[] gameArray, String answer, char userInput){
        ArrayList<Integer> index = new ArrayList<>();
        char[] tempArray = answer.toCharArray();
        for (int i = 0; i < tempArray.length; i++){
            if (tempArray[i] == userInput){
                index.add(i);
            }
        }
        for (int i: index){
            gameArray[i] = userInput;
        }
        return gameArray;
    }

    public static boolean checkGuess(char userInput, String answer){
        return answer.contains(""+userInput);
    }

    public static char getUserGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess:   ");
        return scan.next().charAt(0);
    }

    public static String getRandomWord(){
        int randomVal = getRandomInt(0, words.length);
        return words[randomVal];
    }

    public static char[] createPlaceHolders(String answer) {
        char[] arr = new char[answer.length()];
        Arrays.fill(arr, '_');
        return arr;
    }

    public static void printArray(char[] gameArray){
        System.out.print("Word:   ");
        for (char element: gameArray){
            System.out.print(element);
            System.out.print("  ");
        }
        System.out.print("\n");
    }

    public static void printGallows(int currentTurn){
        int maxGallows = gallows.length;
        System.out.println(gallows[maxGallows - currentTurn]);
    }

    public static void printMisses(ArrayList missArray){
        System.out.print("Misses:   ");
        for (Object o : missArray) {
            System.out.print(o);
        }
        System.out.print("\n");
    }

    public static int getRandomInt(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min) + min;
    }

    public static void exitMessage(boolean hasWon, String answer){
        if (hasWon){
            System.out.println("You Win!");
        }
        if (!hasWon){
            System.out.println("You Lost!");
            System.out.println("Answer was: "+ answer);
        }
    }
}





