import java.util.Scanner;

public class AccountGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        if (!name.matches("\\S+\\s\\S+")) {
            System.out.println("Incorrect format for name");
        } else {
            System.out.println("Valid name");
        }

        sc.close();
    }
}