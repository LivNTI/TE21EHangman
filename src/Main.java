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

        String word = "viking";

        // split the word
        String[] myWord = new String[word.length()];
        myWord = word.split("");

        //Get user input
        Scanner myScan = new Scanner(System.in);
        String guess = myScan.nextLine();

        System.out.println("User guess is " + guess);






        /*
        //Print content of array
        for (int i = 0; i < myWord.length; i++) {
            System.out.println(myWord[i]);
        }
         */


    }
}














