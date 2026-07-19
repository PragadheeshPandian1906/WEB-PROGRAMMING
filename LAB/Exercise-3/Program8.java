import java.util.Scanner;

// Base Class
class Book {
    String bookName, publisher;
    int publishedYear, edition;
    double price;

    Book(String bookName, String publisher, int publishedYear, int edition, double price) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.edition = edition;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Name      : " + bookName);
        System.out.println("Publisher      : " + publisher);
        System.out.println("Published Year : " + publishedYear);
        System.out.println("Edition        : " + edition);
        System.out.println("Price          : Rs." + price);
    }
}

// CollegeBook Class
class CollegeBook extends Book {
    String subject;

    CollegeBook(String bookName, String publisher, int publishedYear,
                int edition, double price, String subject) {
        super(bookName, publisher, publishedYear, edition, price);
        this.subject = subject;
    }

    // Overriding
    @Override
    public void displayDetails() {
        System.out.println("\n--- College Book ---");
        super.displayDetails();
        System.out.println("Subject        : " + subject);
    }

    public void syllabusBook() {
        System.out.println("This is a syllabus-based college book.");
    }
}

// StoryBook Class
class StoryBook extends Book {
    String genre;

    StoryBook(String bookName, String publisher, int publishedYear,
              int edition, double price, String genre) {
        super(bookName, publisher, publishedYear, edition, price);
        this.genre = genre;
    }

    // Overriding
    @Override
    public void displayDetails() {
        System.out.println("\n--- Story Book ---");
        super.displayDetails();
        System.out.println("Genre          : " + genre);
    }

    public void entertainment() {
        System.out.println("This book is for entertainment.");
    }
}

// Main Class
public class Program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Book Type");
        System.out.println("1. College Book");
        System.out.println("2. Story Book");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = sc.nextLine();

        System.out.print("Enter Published Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Edition: ");
        int edition = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Book book; // Upcasting

        if (choice == 1) {
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            book = new CollegeBook(name, publisher, year, edition, price, subject);

            // Polymorphism
            book.displayDetails();

            // Downcasting
            CollegeBook cb = (CollegeBook) book;
            cb.syllabusBook();

        } else if (choice == 2) {
            System.out.print("Enter Genre: ");
            String genre = sc.nextLine();

            book = new StoryBook(name, publisher, year, edition, price, genre);

            // Polymorphism
            book.displayDetails();

            // Downcasting
            StoryBook sb = (StoryBook) book;
            sb.entertainment();

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}