import java.lang.*;
import java.util.*;
public class Program4 {
    final static double PI=3.1415926;


    public static double perimeter(double radius)
    {
        return 2*PI*radius;
    }

    public static double area(double radius)
    {
        return PI*radius*radius;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double radius=sc.nextDouble();
        System.out.println("The perimeter of circle : "+perimeter(radius));
        System.out.println("The area of circle : "+area(radius));
    }
}
