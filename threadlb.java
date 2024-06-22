// Define a class that extends Thread
class MyThread extends Thread {
    
    // Override the run() method to define the task for the thread
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

// Main class to demonstrate thread creation and execution
public class threadlb {
    
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread thread = new MyThread();
        
        // Start the thread
        thread.start();
        
        // Display a message from the main thread
        System.out.println("Main thread is running...");
    }
}
