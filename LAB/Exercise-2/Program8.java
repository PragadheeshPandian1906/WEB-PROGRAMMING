import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Using for loop
        System.out.println("Using For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Using enhanced for loop
        System.out.println("\nUsing Enhanced For Loop:");
        for (int element : list) {
            System.out.print(element + " ");
        }

        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        sc.close();
    }
}