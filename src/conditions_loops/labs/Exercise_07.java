package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] Args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word below.");
        String input = scanner.nextLine().toLowerCase();
        int inputLength = input.length();
        int i = 0;
        boolean vowelFlag = false;

        while (i < inputLength && !vowelFlag){

            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
                input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){

                System.out.println(input + "   " + input.charAt(i));

                vowelFlag = true;

            }else{
                i++;
            }

        }


    }


}
