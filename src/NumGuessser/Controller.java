package NumGuessser;
import java.util.Scanner;
public class Controller {

    public static void invalidInput() {
        System.out.println("Invalid input. Please try again.");
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        RandNumber newRand = new RandNumber();
        System.out.println("Welcome to the number guesser game:\nTry to guess the number, 0-100, in 10 turns or less.\n When ready begin, please enter 'Y': ");
        String begin = scnr.next();
        boolean contin = false;

//      Confirms the user's selection.
        if (!begin.equals("Y")) {
            invalidInput();
            do {
                String begin2 = scnr.next();
                if (begin2.equals("Y")) {
                    contin = true;
                }
                else {
                    invalidInput();
                }
            }while (!contin);
        }

//        User selects difficulty
        boolean next = false;
        do {
            System.out.println("Please select your desired difficulty: Easy(E) or Hard(H): ");
            String difficulty = scnr.next();
            if (difficulty.equals("E") || difficulty.equals("H")) {
                RandNumber.setAllowedGuesses(difficulty);
                next = true;
            }
            else {
                invalidInput();
            }
        }while(!next);

        int newRandomInt = newRand.getRandNum();
        do {
            newRand.setGuesses();
            System.out.println("Enter guess number " + newRand.getGuesses() + ": ");
            int guess = scnr.nextInt();
            if (guess < newRandomInt) {
                System.out.println("Your answer is too low\n");

            } else if (guess > newRandomInt) {
                System.out.println("Your answer is too high\n");
            }
            else {
                System.out.println("Congratulations! The correct answer was: " + newRandomInt);
                return;
            }
        }while (newRand.getGuesses() < newRand.getAllowedGuesses());
        System.out.println("Better luck next time. The correct answer was: " + newRandomInt);
        System.out.println();
    }
}

















