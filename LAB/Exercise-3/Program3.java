import java.util.Scanner;

class Calculator {

    // Static method for integer power
    public static int powering(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * num1;
        }
        return result;
    }

    // Static method for double power
    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}

public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter integer base: ");
        int intBase = sc.nextInt();

        System.out.print("Enter integer exponent: ");
        int intExp = sc.nextInt();

        // Double input
        System.out.print("Enter double base: ");
        double doubleBase = sc.nextDouble();

        System.out.print("Enter double exponent: ");
        double doubleExp = sc.nextDouble();

        // Invoke static methods
        int intResult = Calculator.powering(intBase, intExp);
        double doubleResult = Calculator.powerDouble(doubleBase, doubleExp);

        // Display results
        System.out.println("\nResult of Integer Power: " + intResult);
        System.out.println("Result of Double Power: " + doubleResult);

        sc.close();
    }
}