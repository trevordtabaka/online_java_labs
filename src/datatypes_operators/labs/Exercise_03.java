package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {
        System.out.println("Enter your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String pigLatinName = name.substring(1,2).toUpperCase() + name.substring(2) +name.substring(0,1).toLowerCase() + "ay";

        System.out.println("Your pig latin naem is: " + pigLatinName);

    }
}


