import java.util.*;

// Account Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

// Savings Account
class SavingsAccount implements Account {
    private double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void calculateInterest() {
        double interest = balance * 0.05; // 5% interest
        System.out.println("Interest: " + interest);
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    // Unique Method
    public void addBonus() {
        balance += 500;
        System.out.println("Bonus of Rs.500 Added");
    }
}

// Current Account
class CurrentAccount implements Account {
    private double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance + 1000) { // Overdraft limit
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }

    public void calculateInterest() {
        System.out.println("Current Account has No Interest");
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    // Unique Method
    public void overdraftLimit() {
        System.out.println("Overdraft Limit: Rs.1000");
    }
}

// Bank Class
class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account Added Successfully");
    }

    public void displayAccounts() {
        System.out.println("\nAccount Details:");
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}

// Main Class
public class Program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter Initial Balance for Savings Account: ");
        double sb = sc.nextDouble();

        System.out.print("Enter Initial Balance for Current Account: ");
        double cb = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(sb);
        CurrentAccount ca = new CurrentAccount(cb);

        bank.addAccount(sa);
        bank.addAccount(ca);

        System.out.print("\nEnter Deposit Amount for Savings Account: ");
        sa.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount for Savings Account: ");
        sa.withdraw(sc.nextDouble());

        sa.calculateInterest();
        sa.addBonus();
        sa.viewBalance();

        System.out.println();

        System.out.print("Enter Deposit Amount for Current Account: ");
        ca.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount for Current Account: ");
        ca.withdraw(sc.nextDouble());

        ca.calculateInterest();
        ca.overdraftLimit();
        ca.viewBalance();

        bank.displayAccounts();

        sc.close();
    }
}