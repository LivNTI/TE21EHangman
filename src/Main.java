/*
 * Todo:
 *   * välj ett ord
 *     - statisk
 *     - user input?
 *     - från en lista?
 *     - från en fil?
 *     - från en hemsida
 *   * använder väljer en bokstav
 *   * finns bokstaven i ordet?
 *       - var är bokstaven?
 *       - visa bokstaven
 *       - bli av med försök
 *   * loopa tills
 *       - ordet är helt
 *       - inga liv
 *   *

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Hangman");

        //choose a word
        // char aCharacter = '^'; // this is a character
        String word = "ödla";

        //declaring varieables for later use
        String guess;

        // split the word
        String[] myWord = new String[word.length()];
        myWord = word.split("");
        printArray(myWord);

        // the word that has been guessed
        String[] revealedWord = new String[myWord.length];
        int counter = 0;
        //creates an array filled with "_"
        while (counter < revealedWord.length) {
            revealedWord[counter] = "_";
            counter++;
            //counter = counter + 1;   //same as counter++
            // counter =+ 1;    //same as counter++
        }
        printArray(revealedWord);

        //set the amount of lives (tries) the user has
        int lives = 2;
        boolean wordRevealed = false; // must be false to initiate the loop

        while ((lives > 0) && (wordRevealed == false)) { // !wordRevealed samma som wordRevealed == false
            //we assume that the word ahs been revealed
            wordRevealed = true;
            //Get user input
            Scanner myScan = new Scanner(System.in);

            //check if guess is allowed
            do {
                System.out.print("Enter a guess: ");
                guess = myScan.nextLine();
            } while ((!guess.matches("[a-öA-Ö]+"))
                    || (guess.length() != 1));

            System.out.println("User guess is " + guess);

            boolean letterExists = false;
            //check if the letter is in the word
            for (int i = 0; i < myWord.length; i++) {
                if (guess.equalsIgnoreCase(myWord[i])) {
                    System.out.println("the letter " + guess + " is in position " + i);
                    //replace the "_" in revealedWord with the guess
                    revealedWord[i] = guess.toUpperCase();
                    letterExists = true;
                }
                if ("_".equals(revealedWord[i])) {
                    wordRevealed = false;
                }
            }

            if (!letterExists) { // same as : letterExists == false
                lives--;
            }

            //print our reveald word
            printArray(revealedWord);
            System.out.println("you now have " + lives + " lives left");
        }


    }

    public static void printArray(String[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
    }
}














