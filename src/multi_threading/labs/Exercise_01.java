package multi_threading.labs;


/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */


class Exercise_01{

    public static void main(String[] args) {

        NewThreads myThread = new NewThreads();
        NewThreads myThread2 = new NewThreads();

        for(int i = 1; i<26;i+=2){

            System.out.println("main:  "+i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}