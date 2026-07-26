import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {

            System.out.println("\n1. Find Factorial");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 2)
                break;

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            try {
                System.out.println("Factorial = " + MathUtils.factorial(num));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}