package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] Args){

        for(int i = 0; i <= 10; i++) {
            if(i == 4){
                System.out.println("no 4's");
                continue;
            }
            System.out.println(i);

        }
    }

}
