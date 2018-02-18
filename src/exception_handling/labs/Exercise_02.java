package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


class Exercise_02{

    public static void main(String[] args) {
        Array[] arrayOne = new Array[8];
        System.out.println("before catch");
        try {
            for (int i = 0; i < 10; i++) {

              //  double x = 10/(i-4);       // would trigger arithmetic exception
                System.out.println();
                System.out.print(arrayOne[i] + ": ");
                System.out.println(i);
            }
        }catch(ArithmeticException exc){

            System.out.println("caught arithmetic Exception");

        }catch(Exception exc){

            System.out.println("Exception that was not arithmetic");
        }
        System.out.println("after try catch");
    }

}