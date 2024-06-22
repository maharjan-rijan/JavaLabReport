// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    private String message;
    
    // Constructor to initialize message for each thread
    public MyRunnable(String message) {
        this.message = message;
    }
    
    // Override the run() method to define the task for the thread
    @Override
    public void run() {
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is running with message: " + message);
    }
}

// Main class to demonstrate creating and running multiple threads
public class multiThreading {
    
    public static void main(String[] args) {
        // Create multiple instances of MyRunnable
        MyRunnable runnable1 = new MyRunnable("Hello from Thread 1");
        MyRunnable runnable2 = new MyRunnable("Hi from Thread 2");
        MyRunnable runnable3 = new MyRunnable("Namaste from Thread 3");
        
        // Create threads for each MyRunnable instance
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        
        // Start each thread
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Display a message from the main thread
        System.out.println("Main thread is running...");
    }
}
