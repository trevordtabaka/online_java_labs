package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] Args){

        System.out.println("Enter a + number below to be your lower bounds.");
        Scanner scanner1 = new Scanner(System.in);
        int lowerBounds = scanner1.nextInt();

        System.out.println("Enter a + number below to be your upper bounds. Be reasonable.");
        Scanner scanner2 = new Scanner(System.in);
        int upperBounds = scanner2.nextInt();
        int sum = 0;
        double avg;
        int count = 0;
        for(int i = lowerBounds; i<= upperBounds; i++){

            count++;
            sum += i;
            if(i == upperBounds){
                avg = (double) sum / count;
                System.out.println("The sum of the numbers from " + lowerBounds + " to " + upperBounds + " is: " + sum);
                System.out.println("The average is " + avg);
            break;
            }

        }






    }
}
