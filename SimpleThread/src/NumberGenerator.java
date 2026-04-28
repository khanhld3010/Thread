public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + "print Number "
                        + i + " have HashCode is " + Thread.currentThread().hashCode());
               // Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " bị ngắt.");
        }
    }
}
