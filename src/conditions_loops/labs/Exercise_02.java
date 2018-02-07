package conditions_loops.labs;

import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Enter a number 1-7");

        // assign input to variable as int
        int input = scanner.nextInt();

        // write completed code here
        if(input == 1){
            System.out.println("Monday");
        }else if(input == 2){
            System.out.println("Tuesday");
        }else if(input == 3){
            System.out.println("Wednesday");
        }else if(input == 4){
            System.out.println("Thursday");
        }else if(input == 5){
            System.out.println("Friday");
        }else if(input == 6){
            System.out.println("Saturday");
        }else if(input == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Other");
        }
    }
}
