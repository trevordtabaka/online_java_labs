package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        int[][] irregArray = {
                {1,3,5,7,9},
                {2,4,6,8},
        };

        for(int[] i: irregArray){
            for(int number: i){

                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}
