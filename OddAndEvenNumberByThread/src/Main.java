public class Main {
    static void main(String[] args) {
        Runnable evenNumber = new EvenThread();
        Runnable oddNumber = new OddThread();
        Thread threadPrintEvenNumber = new Thread(evenNumber, "Thread 1");
        Thread threadPrintOddNumber = new Thread(oddNumber, "Thread 2");
        try {
            threadPrintOddNumber.start();
            threadPrintOddNumber.join();
            threadPrintEvenNumber.start();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//
//        threadPrintEvenNumber.start();
//        threadPrintOddNumber.start();
    }
}
