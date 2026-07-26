class MyThread extends Thread {
    int count;

    MyThread(String name, int priority, int count) {
        super(name);
        setPriority(priority);
        this.count = count;
    }

    public void run() {
        try {
            // Put highest-priority threads to sleep
            if (getPriority() == Thread.MAX_PRIORITY) {
                System.out.println(getName() + " is sleeping...");
                Thread.sleep(3000);
            }

            for (int i = 1; i <= count; i++) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(500);
            }

            System.out.println(getName() + " finished.");

        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("Thread-1", 3, 5);
        MyThread t2 = new MyThread("Thread-2", 10, 10); // Highest priority
        MyThread t3 = new MyThread("Thread-3", 7, 6);
        MyThread t4 = new MyThread("Thread-4", 10, 12); // Highest priority
        MyThread t5 = new MyThread("Thread-5", 5, 4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for a short time
        Thread.sleep(1000);

        // Check whether threads are alive
        System.out.println("\nThread Status:");
        System.out.println(t1.getName() + " Alive: " + t1.isAlive());
        System.out.println(t2.getName() + " Alive: " + t2.isAlive());
        System.out.println(t3.getName() + " Alive: " + t3.isAlive());
        System.out.println(t4.getName() + " Alive: " + t4.isAlive());
        System.out.println(t5.getName() + " Alive: " + t5.isAlive());

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("\nLongest lasting thread: Thread-4");
    }
}