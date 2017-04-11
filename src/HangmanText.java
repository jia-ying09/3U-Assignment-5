
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

        //asking player 2 to enter their guess
        System.out.println("Player 2 guess a letter");

        //inputting the letter
        String enterGuess = input.nextLine();

        char letter = word.charAt(0);

        char character = word.charAt(0);

        //get the length of the word
        int length = word.length();


        //print out a line for each letter
        for (int i = 0; i < length; i++) {

            while (true) {
                if (character >= 'a'
                        || character <= 'z') {

                    //find all of the letters and replace them with lines  
                    System.out.println(" _ "); 


                    while (true) {

                        //find all of the letters and replace them with lines  
                        //see if the letter is in the word
                        if (enterGuess.equals(character) == true) {

                            String replace = enterGuess.replaceFirst(word, enterGuess);

                            //find all of the letters and replace them with lines  
                            System.out.println(enterGuess + "_");

                        } else {

                            //see if the letter is not in the word
                            if (enterGuess.equals(character) == false) {

                                //get the number of lives after each guess
                                int lives = 6 - 1;

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
