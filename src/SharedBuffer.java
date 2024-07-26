import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private int capacity;
    public SharedBuffer(int capacity){
        this.capacity=capacity;
    }
    public void produce(int value) throws InterruptedException {
        synchronized(this){
            while(buffer.size()==capacity){
                wait();
            }
            buffer.add(value);
            System.out.println("produced : "+value);
            notifyAll();
        }
    }
    public int consume() throws InterruptedException {
        synchronized(this){
            while(buffer.isEmpty()){
                wait();
            }
            int value=buffer.poll();
            System.out.println("Consumed :" + value);
            notifyAll();
            return value;
        }
    }
}
