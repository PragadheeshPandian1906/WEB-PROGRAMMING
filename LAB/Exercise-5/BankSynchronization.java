class BankAccount {
    private int balance = 1000; // Initial Balance

    // Synchronized deposit method
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " deposited: " + amount);
        System.out.println("Balance = " + balance);
    }

    // Synchronized withdraw method
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew: " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " - Insufficient Balance");
        }
        System.out.println("Balance = " + balance);
    }
}

// Deposit Thread
class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

// Withdraw Thread
class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

public class BankSynchronization {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread t1 = new DepositThread(account);
        WithdrawThread t2 = new WithdrawThread(account);
        DepositThread t3 = new DepositThread(account);
        WithdrawThread t4 = new WithdrawThread(account);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t4.setName("Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}