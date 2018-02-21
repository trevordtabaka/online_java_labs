package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class Exercise_02 extends Thread{

    static int threadCount = 0;
    public Exercise_02(String name) {
        super(name);

        start();
    }

    public void run() {
        threadCount++;
        System.out.println("Thread "+ this.getName() + " " +threadCount+ " has started");

        for(int i = 0 ; i<100 ; i++){
                        
        System.out.println("Thread "+ this.getName() + " " +i);


        }

    }
}