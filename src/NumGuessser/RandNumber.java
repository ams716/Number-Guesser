package NumGuessser;

import java.util.Random;
public class RandNumber {
    Random randomNum = new Random();
    private static int randNum;
    private static int guesses;
    private static int allowedGuesses;


//    Contstructor to create a new random number.
    public RandNumber() {
        this.randNum = randomNum.nextInt(100);
        this.guesses = 0;
        this.allowedGuesses = 0;
    }


    public static int getRandNum() {
        return randNum;
    }
    public static void setGuesses() {
        guesses++;
    }
    public static int getGuesses() {
        return guesses;
    }

    public static int getAllowedGuesses() {
        return allowedGuesses;
    }
    public static void setAllowedGuesses(String difficulty) {
        if (difficulty.equals("E")) {
            allowedGuesses = 10;
        } else if (difficulty.equals("H")) {
            allowedGuesses = 5;
        }
    }
}