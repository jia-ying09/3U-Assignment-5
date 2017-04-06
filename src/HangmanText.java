
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

        
        //clear screen
        int clear = word.charAt(0);
        
        //clear the screen
        wordInput.setText("");
        
        //get character
        char character = word.charAt(0);
        
        for (int i = 0; i < clear; i++) {
  
        }

        //get the length of the word
        int length = word.length();

        //print out a line for each letter
        for (int i = 0; i < length; i++) {

            //do not input numbers
            // if (character >= 0 || character <= 0) {
            //   output.getText();

            // }else{ 

            //use letters between a and z
            if (character >= 'a'
                    || character <= 'z') {

                //find all of the letters and replace them with lines  
                output.replaceSelection(" _ ");

                //asking player 2 to enter their guess
                System.out.println("Player 2: Insert your guess:");

                //a
                //input the guess
                int i = " - "();


                        ///telling the player how many lives they have and to insert a guess
                       // System.out.println("Player 2: You have " + lives + " lives left. Insert your guess:");

                //input the word
                //  String word = wordInput.getText();

                //clear screen
                // int clear = word.charAt(0);

                //clear the screen
                // wordInput.setText("");

                //get character
                //   char character = word.charAt(0);

                //    for (int i = 0; i < clear; i++) {

            }
            //get the length of the word
            //   int length = word.length();
            //print out a line for each letter
            //   for (int i = 0; i < length; i++) {
            //do not input numbers
            // if (character >= 0 || character <= 0) {
            //   output.getText();
            // }else{ 
            //use letters between a and z
            //     if (character >= 'a'
            //      || character <= 'z') {
            //find all of the letters and replace them with lines  
            //  output.replaceSelection(" _ ");
        }
