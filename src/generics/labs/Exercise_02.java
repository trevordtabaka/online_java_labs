package generics.labs;

import java.lang.reflect.Array;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */

class Exercise_02{

    static <E , U extends Integer> void  printArrayIndex(E[] inputArray, int index){

        System.out.println(inputArray[index].toString());
    }


    public static void main(String[] args) {

        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};


        printArrayIndex(nums, 0);
        printArrayIndex(nums, 1);
        printArrayIndex(nums, 2);

        printArrayIndex(nums, 4);



    }

}