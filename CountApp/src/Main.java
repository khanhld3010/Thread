public class Main {
    static void main(String[] args) {
        Count count = new Count();
//        Count count1 = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
//            count.getMyThread().join();
//            count1.getMyThread().join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
