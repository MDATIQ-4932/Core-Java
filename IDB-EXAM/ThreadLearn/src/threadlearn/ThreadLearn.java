package threadlearn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLearn {
    
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(4);        
        
        for (int i = 1; i <= 10; i++) {
            Runnable task = new ThreadLearnClass(i);
            executor.submit(task);
        }
        
        executor.shutdown();
    }
    
}
