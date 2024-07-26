public class BasicThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new MyThread());
        thread.start();
        for(int i=0 ; i<5 ; i++){
            System.out.println("Main Count :" + i);
            Thread.sleep(1000);
        }
    }
}
class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0 ; i<5 ; i++){
            System.out.println("Count :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}