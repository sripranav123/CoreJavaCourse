public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer=new SharedBuffer(5);
        Thread producerThread= new Thread(new Producer(buffer));
        Thread consumerThread=new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}