public class Main {
    static void main(String[] args) {
        Runnable runnable1 = new NumberGenerator();
        Runnable runnable2 = new NumberGenerator();

        Thread thread1 = new Thread(runnable1,"Thread 1");
        Thread thread2 = new Thread(runnable2,"Thread 2");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
