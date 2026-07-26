class ForwardThread extends Thread {
    public void run() {
        try {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " ");
                Thread.sleep(1000); // 1 second
            }
            System.out.println("\nForward Thread Finished.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ReverseThread extends Thread {
    public void run() {
        try {
            for (char ch = 'Z'; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
                Thread.sleep(2000); // 2 seconds
            }
            System.out.println("\nReverse Thread Finished.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class AlphabetThreads {
    public static void main(String[] args) {
        ForwardThread t1 = new ForwardThread();
        ReverseThread t2 = new ReverseThread();

        t1.start();

        try {
            // Wait until Thread 1 completes
            t1.join();

            // Start Thread 2 only after Thread 1 finishes
            t2.start();

            // Wait until Thread 2 completes
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nAll threads have finished execution.");
    }
}