class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello!");
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HolidayThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Happy Holidays!");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EnjoyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Enjoy!");
            try {
                Thread.sleep(5000); // 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        HolidayThread t2 = new HolidayThread();
        EnjoyThread t3 = new EnjoyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}