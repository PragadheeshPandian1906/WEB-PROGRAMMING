import java.util.Scanner;

// Person class
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Money class
class Money {
    private double amount;

    // Constructor
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy Constructor
    public Money(Money other) {
        this.amount = other.amount;
    }

    public String toString() {
        return "Rs. " + amount;
    }
}

// CreditCard class
class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);          // Balance initialized to zero
        this.creditLimit = new Money(creditLimit); // Copy constructor
    }

    public void display() {
        System.out.println("\n----- Credit Card Details -----");
        System.out.println("Owner Name   : " + owner.getName());
        System.out.println("Balance      : " + balance);
        System.out.println("Credit Limit : " + creditLimit);
    }
}

// Main class
public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter Owner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Limit: ");
        double limit = sc.nextDouble();

        // Create objects
        Person p = new Person(name);
        Money creditLimit = new Money(limit);

        CreditCard card = new CreditCard(p, creditLimit);

        // Display details
        card.display();

        sc.close();
    }
}