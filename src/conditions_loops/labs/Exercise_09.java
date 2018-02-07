package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] Args){
        int i = 0;
        boolean flag = false;
        while(!flag){
            System.out.println("i equals: " + i);
            if(i == 4){
                System.out.println("Done at 4");
                flag = true;
            }

            i++;
        }

    }
}
