import java.lang.*;
import java.util.*;

interface Shape
{
    public double area();
    public double perimeter();
}

class Circle implements Shape
{
    private double radius;
    private final static double PI;
    static
    {
        PI=3.1415926;
    }
    public Circle()
    {
        radius=1.00;
    }
    public Circle(double r)
    {
        this.radius=r;
    }
    public double area()
    {
        return PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*PI*radius;
    }
}

class Rectangle implements Shape
{
    private double length;
    private double breadth;
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}

class Triangle implements Shape{
    public double a;
    public double b;
    public double c;

    public Triangle()
    {
        a=1.00;
        b=1.00;
        c=1.00;
    }
    public Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double perimeter()
    {
        return a+b+c;
    }
    public double area()
    {
        double s=(a+b+c)/2;
        double temp=s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(temp);
    }
}


public class Program5 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        double radius,length,breadth,a,b,c;
        System.out.print("Enter radius : ");
        radius=sc.nextDouble();
        System.out.print("Enter length : ");
        length=sc.nextDouble();
        System.out.print("Enter breadth : ");
        breadth=sc.nextDouble();
        System.out.print("Enter a : ");
        a=sc.nextDouble();
        System.out.print("Enter b : ");
        b=sc.nextDouble();
        System.out.print("Enter c : ");
        c=sc.nextDouble();
        Circle cr=new Circle(radius);
        Rectangle r=new Rectangle(length, breadth);
        Triangle t=new Triangle(a, b, c);

        System.out.printf("The area of Circle : %f\n",cr.area());
        System.out.printf("The perimeter of Circle : %f\n",cr.perimeter());
        System.out.printf("The area of Rectangle : %f\n",r.area());
        System.out.printf("The perimeter of Rectangle : %f\n",r.perimeter());
        System.out.printf("The area of triangle : %f\n",t.area());
        System.out.printf("The perimeter of triangle : %f\n",t.perimeter());

    }
}
