
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class HangmanText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //insert Scanner
        Scanner input = new Scanner(System.in);

        //ask player 1 to insert the word
        System.out.println("Player 1: Enter a word for Player 2 to guess:");

        //inputting player 1 word{
        String word = input.nextLine();

        //clearing the screen
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //get the length of the word
        int length = word.length();

        //print out a line for each letter
        for (int i = 0; i < length; i++) {

            //find all of the letters and replace them with lines
            System.out.println("_");
        }

        //asking player 2 to enter their guess
        System.out.println("Player 2 guess a letter");

        //inputting the letter
        String enterGuess = input.nextLine();

        char letter = word.charAt(0);

        while (true) {

            for (int i = 0; i < length; i++) {
                String str = Integer.toString(i);

                //find all of the letters and replace them with lines  
                //see if the letter is in the word
                if (enterGuess.equals(i) == true) {

                    String replace = enterGuess.replaceFirst(word, enterGuess);

                    //find all of the letters and replace them with lines  
                    System.out.println(enterGuess + " _ ");

                } else {

                    //see if the letter is not in the word
                    if (enterGuess.equals(i) == false) {

                        int thing = 1;
                        //create counter for number of lives left
                        for (int n = 0; n < thing; n++) {
                            //int n = n - 1;
                            //get the number of lives after each guess
                            int lives = 6;
                            {

                                //output the number of lives and tell player two to take another guess
                                System.out.println("You have " + lives + " lives left. Player two guess a letter.");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
