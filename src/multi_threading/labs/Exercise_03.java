package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */
class Exercise_03 extends Thread{

    static int threadCount = 0;
    public Exercise_03(String name, int priority) {
        super(name);
        this.setPriority(priority);
    }

    public void run() {

        threadCount++;
        System.out.println("Thread "+ this.getName() + " " +threadCount+ " has started");

        for(int i = 0 ; i<100 ; i++){

            System.out.println("Thread "+ this.getName() + " " +i);


        }

    }
}