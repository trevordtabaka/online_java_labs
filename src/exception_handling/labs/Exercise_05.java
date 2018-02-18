package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Exercise_05{

    public static void main(String[] args) {
        Array[] arrayOne = new Array[8];
        System.out.println("before catch");
        try {
            for (int i = 0; i < 10; i++) {

                if(i>=8){
                    throw new ArrayIndexOutOfBoundsException();
                }

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