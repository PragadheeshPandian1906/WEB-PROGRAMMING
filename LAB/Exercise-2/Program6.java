import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Collections.sort(list);

        System.out.println("Sorted List:");

        for (String str : list) {
            System.out.println(str);
        }

        sc.close();
    }
}