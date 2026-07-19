import java.util.Scanner;

class Display {

    // Method with (int, char)
    void printData(int n, char c) {
        System.out.println("Integer : " + n);
        System.out.println("Character : " + c);
    }

    // Overloaded method with (char, int)
    void printData(char c, int n) {
        System.out.println("Character : " + c);
        System.out.println("Integer : " + n);
    }
}

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display obj = new Display();

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("\nCalling printData(int, char)");
        obj.printData(num, ch);

        System.out.println("\nCalling printData(char, int)");
        obj.printData(ch, num);

        sc.close();
    }
}