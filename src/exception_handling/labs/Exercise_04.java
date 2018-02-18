package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class Exercise_04{

    public static void main(String[] args) {
        Array[] arrayOne = new Array[8];
        System.out.println("before catch");
        try {

            try {

                for (int i = 0; i < 10; i++) {

                    double x = 10/(i-4);       // would trigger arithmetic exception instead of outer array exc
                    System.out.println();
                    System.out.print(arrayOne[i] + ": ");
                    System.out.println(i);
                }
            } catch (ArithmeticException exc) {

                System.out.println("caught arithmetic Exception");
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {

                System.out.println("Exception that was not arithmetic");


        }
        System.out.println("after both try catch");
    }


}