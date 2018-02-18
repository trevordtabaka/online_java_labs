package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01{

    public static void main(String[] args) {
        Array[] arrayOne = new Array[8];
        System.out.println("before catch");
        try {
            for (int i = 0; i < 10; i++) {


                System.out.print(arrayOne[i] + ": ");
                System.out.println(i);
            }
        }catch(Exception exc){

            System.out.println("caught Exception");

        }
        System.out.println("after try catch");
    }

}