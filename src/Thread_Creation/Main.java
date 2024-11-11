package Thread_Creation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In thread " + Thread.currentThread().getName());
            }
        });

        System.out.println("Before thread starting " + Thread.currentThread().getName());
        thread.start();
        System.out.println("After thread starting " + Thread.currentThread().getName());
        thread.setName("Thread_Creation");

        thread.sleep(10000);
    }
}
