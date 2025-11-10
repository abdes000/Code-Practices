class Threads implements Runnable {
    private Thread thread;
    private String threadName;    
    Threads(String threadName) {
        this.threadName = threadName;    
        System.out.println("Waiting " + this.threadName);
    }
    @Override 
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(3000);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        
    }
}
public class Threading {
    
}
