package multi_threading.labs;

public class Exercise_03_Controller {

    public static void main(String[] args) {


        Exercise_03 newThread = new Exercise_03("A", 1);
        Exercise_03 newThread2 = new Exercise_03("B", 5);
        Exercise_03 newThread3 = new Exercise_03("C", 7);
        Exercise_03 newThread4 = new Exercise_03("D", 10);

        newThread.start();
        newThread2.start();
        newThread3.start();
        newThread4.start();
        System.out.println(" main thread done-zo");


    }

}
