class BankAccount {
    int totalBalance = 1000;
    boolean isBusy = false; 

    public synchronized void withdraw(String name, int amount) {
        while (isBusy) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        isBusy = true;

        System.out.println(name + " is trying to withdraw " + amount);

        if (totalBalance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            totalBalance -= amount;
            System.out.println("Balance after " + name + "'s withdrawal: " + totalBalance);
        } else {
            System.out.println("Not enough balance for " + name);
        }

        
        isBusy = false;
        notify();
    }
}

class Account extends Thread {
    BankAccount account;
    int amount;

    public Account(BankAccount account, int amount, String name) {
        super(name); // set thread name
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(getName(), amount);
    }
}

public class BankBalance {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Account t1 = new Account(sharedAccount, 800, "Thread-1");
        Account t2 = new Account(sharedAccount, 500, "Thread-2");
     t1.setName("mohan");
     t2.setName("sohan");
        t1.start();
        t2.start();
    }
}
