import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer , String> map = new HashMap<>();
        Thread thread1=new Thread(new HashMapWorker(map));
        Thread thread2=new Thread(new HashMapWorker(map));
        Thread thread3=new Thread(new HashMapWorker(map));
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Size of Map "+map);
    }
}


class HashMapWorker implements Runnable{
    private Map<Integer , String> map;
    public HashMapWorker(Map<Integer , String> map){
        this.map=map;
    }
    @Override
    public void run() {
        for(int i=0 ; i<5 ; i++){
            synchronized (map){
                map.put(i , "value"+i);
            }
        }
    }
}