// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    
    // Override the run() method to define the task for the thread
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

// Main class to demonstrate thread creation and execution
public class runThread {
    
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        
        // Create a new Thread and pass in the MyRunnable instance
        Thread thread = new Thread(myRunnable);
        
        // Start the thread
        thread.start();
        
        // Display a message from the main thread
        System.out.println("Main thread is running...");
    }
}
