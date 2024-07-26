public class ThreadStatesExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =new Thread(()->{
            System.out.println("Thread States " +Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
                synchronized (ThreadStatesExample.class){
                    ThreadStatesExample.class.wait(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("Before Starting " + thread.getState());
        thread.start();
        System.out.println("After Strating " + thread.getState());
        while(thread.isAlive()){
            System.out.println("Thread State " + thread.getState());
            Thread.sleep(200);
        }
        System.out.println("After Completion " + thread.getState());
    }
}