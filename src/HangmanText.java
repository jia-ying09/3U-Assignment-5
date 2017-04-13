
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

            String dash = "_";
            //find all of the letters and replace them with lines
            System.out.println(dash);
        }

        //loop
        while (true) {
            //asking player 2 to enter their guess
            System.out.println("Player 2 guess a letter");

            //inputting the letter
            String enterGuess = input.nextLine();

            char letter = word.charAt(0);



            for (int i = 0; i < length; i++) {

                //converting the integer to string
                String str = Integer.toString(i);

                //find all of the letters and replace them with lines  
                //see if the letter is in the word
                if (enterGuess.equalsIgnoreCase(word) == true) {

                    //get the length of the letter
                    int letterLength = word.length();

                    String replace = "_".replaceAll("_", enterGuess);

                    //find all of the letters and replace them with lines  
                    System.out.println(enterGuess);

                    //subtracting the number of correct letters by the number of letters in the word
                    length = letterLength - length;

                    //output the amount of dashes left and output it
                    for (int n = 0; n < length; n++) {
                        System.out.println(" _ ");

                        
                        //if the player guesses the word output "CONGRATULATIONS! YOU WIN!"
                        
                        if (enterGuess.equalsIgnoreCase(word) == true) {
                            
                        }
                        System.out.println("CONGRATULATIONS! YOU WIN!");
                        break;
                    }

                } else {
                  
                    // int n = 1 + 1;
                    double counter = Math.scalb(1, 0);
                    double lives = 6 - counter - 1;
                    
                    //see if the letter is not in the word
                    if (enterGuess.equals(word) == false) {

                        //int thing = 1;
                        //create counter for number of lives left
                        for (int n = 0; n < lives; n++) {

                            //get the number of lives after each guess
                            //output the number of lives and tell player two to take another guess
                            System.out.println("You have " + lives + " lives left. Player two guess a letter.");
                            String takeAGuess = input.nextLine();
                        }
                    }
                }
            }
        }
    }
}
