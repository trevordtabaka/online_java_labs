package exception_handling.labs;

import java.lang.reflect.Array;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06{

    static int arrayThrowCount = 0;

    public static void throwArrayExc(){
        arrayThrowCount++;
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        Array[] arrayOne = new Array[8];
        System.out.println("before catch");
        try {
            for (int i = 0; i < 10; i++) {

                if(i>=8){
                    throwArrayExc();
                }

                System.out.println();
                System.out.print(arrayOne[i] + ": ");
                System.out.println(i);
            }
        }catch(ArithmeticException exc){

            System.out.println("caught arithmetic Exception");

        }catch(ArrayIndexOutOfBoundsException exc){


            System.out.println("Array Exception was thrown. array exception count is: "+ arrayThrowCount);
        }catch(Exception exc){

            System.out.println("Exception that was not arithmetic");
        }
        System.out.println("after try catch");
    }

}