import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapExample {
    public static void main(String[] args){
        //ConcurrentHashMap<String , Integer> map=new ConcurrentHashMap<>();
        List<String> list=new CopyOnWriteArrayList<>();
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Runnable task1 = ()->{
            for(int i=0 ; i<5 ; i++){
                list.add("a"+i);
                System.out.println(Thread.currentThread().getName() + " Added : a " + i);

            }
        };
        Runnable task2 = ()->{
            for(int i=0 ; i<5 ; i++){
                list.add("b"+i );
                System.out.println(Thread.currentThread().getName() + " Added : b " + i);

            }
        };
        Runnable task3 = ()->{
            for(int i=0 ; i<5 ; i++){
                list.add("c"+i);
                System.out.println(Thread.currentThread().getName() + " Added : c " + i);
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
        while(!executorService.isTerminated()){

        }
        System.out.println("final map : " +list);
    }
}
