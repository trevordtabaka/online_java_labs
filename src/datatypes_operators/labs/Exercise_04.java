package datatypes_operators.labs;


import java.util.Scanner;
import java.util.Arrays;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

 public class Exercise_04 {
    static int count = 0;
    static int[] numberArray = new int[10];

    public static void main(String[] args) {

        // Get user input and into an array
        userInput();

        calcSumAvg(numberArray);








    }

    public static void userInput(){

        for(int i = count; i<10;i++) {
            System.out.println("Input a number. You have inputted " + (i) + "/10 numbers so far");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            numberArray[i] = input;

            count++;
        }
    }
    public static void calcSumAvg(int[] numberArray){
        double sum=0;
        double avg;
        for(int i= 0; i<numberArray.length; i++){
           // System.out.println("before add: " + sum);

            sum = sum + numberArray[i];
          //  System.out.println("after add: " + sum);
        }
        avg = sum / 10;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + avg);

    }

}