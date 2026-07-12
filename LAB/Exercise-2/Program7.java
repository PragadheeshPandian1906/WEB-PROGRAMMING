import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter element to remove: ");
        int element = sc.nextInt();

        list.removeAll(Collections.singleton(element));

        System.out.println("List after removing all occurrences:");
        System.out.println(list);

        sc.close();
    }
}