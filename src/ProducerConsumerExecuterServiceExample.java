import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerExecuterServiceExample {
    public static void main(String[] args){
        SharedBuffer buffer = new SharedBuffer(5);
        Producer producer=new Producer(buffer);
        Consumer consumer=new Consumer(buffer);
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(producer);
        executorService.submit(consumer);
        executorService.shutdown();
    }
}