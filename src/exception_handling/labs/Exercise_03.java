package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Exercise_03{

    public static void main(String[] args) {
        Array[] arrayOne = new Array[8];
        System.out.println("before catch");
        try {
            for (int i = 0; i < 10; i++) {


                System.out.print(arrayOne[i] + ": ");
                System.out.println(i);
            }
        }catch(ArithmeticException exc){

            System.out.println("caught Arithmetic Exception");

        }catch (ArrayIndexOutOfBoundsException exc){

            System.out.println("caught ArrayIndex... Exception");

        }

        finally{

            System.out.println("Code in finally after try catch");
        }

    }

}