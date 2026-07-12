import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] array = new String[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        // Array to List
        List<String> list = new ArrayList<>(Arrays.asList(array));

        System.out.println("Array to List:");
        System.out.println(list);

        // List to Array
        String[] newArray = list.toArray(new String[0]);

        System.out.println("List to Array:");
        for (String element : newArray) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}