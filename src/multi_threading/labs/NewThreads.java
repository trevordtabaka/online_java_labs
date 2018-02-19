package multi_threading.labs;


public class NewThreads implements Runnable {

    Thread thread;
    static int threadCount = 0;

    @Override
    public void run() {

        for(int i = 0; i<25;i+=2){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.thread.getName()+" "+i);
        }

    }

    public NewThreads() {
        threadCount++;
        thread = new Thread(this, ("thread: " + threadCount));
        thread.start();

    }
}
