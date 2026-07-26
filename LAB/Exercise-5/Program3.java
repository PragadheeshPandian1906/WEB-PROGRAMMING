import java.util.Random;

class SquareThread extends Thread {
    int num;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square of " + num + " = " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}

class NumberThread extends Thread {
    Random random = new Random();

    public void run() {
        while (true) {
            int num = random.nextInt(100); // Generates numbers from 0 to 99
            System.out.println("\nGenerated Number: " + num);

            if (num % 2 == 0) {
                SquareThread s = new SquareThread(num);
                s.start();
            } else {
                CubeThread c = new CubeThread(num);
                c.start();
            }

            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}