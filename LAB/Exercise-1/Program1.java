import java.lang.*;
import java.util.*;

public class Program1
{
    public static int square(int n)
    {
        return n*n;
    }

    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number n : ");
        n=sc.nextInt();
        System.out.printf("The square of %d is %d.\n",n,square(n));
        sc.close();
    }
}