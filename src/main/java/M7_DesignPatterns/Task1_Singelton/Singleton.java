package M7_DesignPatterns.Task1_Singelton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Singleton {
    // Private constructor prevents instantiation from other classes
    private Singleton() { }
    // SingletonHelper is loaded on the first execution of Singleton.getInstance()
    // or the first access to SingletonHelper.INSTANCE, not before.
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    // Method to demonstrate parallel execution
    public void executeInParallel() {
        // Task to be executed in parallel
        Runnable task = () -> {
            // Your parallel task code here
            System.out.println("Executing task by " + Thread.currentThread().getName());
        };
        // Creating a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(10);
        // Submitting tasks for execution
        for (int i = 0; i < 10; i++) {
            executor.submit(task);
        }
        // Shutting down the executor
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Getting the Singleton instance and executing the parallel tasks
        Singleton instance = Singleton.getInstance();
        instance.executeInParallel();
    }
}
