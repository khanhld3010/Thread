public class EvenThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " odd number " + i);
                    Thread.currentThread().sleep(15);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
