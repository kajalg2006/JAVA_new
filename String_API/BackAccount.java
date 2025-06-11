import java.util.*;
import java.io.File;
import java.io.FileWriter;

class CreateBankAccount {
    private static int accountCounter = 10000000;
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private double loanBalance;
    private List<String> transactionHistory;

    public CreateBankAccount(String name) {
        this.accountHolderName = name;
        this.accountNumber = ++accountCounter;
        this.balance = 0.0;
        this.loanBalance = 0.0;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: 0.0");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + ", New Balance: " + balance);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + ", New Balance: " + balance);
            System.out.println("Withdrawal successful.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void takeLoan(double amount) {
        if (amount > 0) {
            loanBalance += amount;
            balance += amount;
            transactionHistory.add("Loan taken: " + amount + ", Loan Balance: " + loanBalance + ", New Account Balance: " + balance);
            System.out.println("Loan approved and added to your account balance.");
        } else {
            System.out.println("Invalid loan amount.");
        }
    }

    public void repayLoan(double amount) {
        if (amount > 0 && amount <= balance && amount <= loanBalance) {
            balance -= amount;
            loanBalance -= amount;
            transactionHistory.add("Loan repaid: " + amount + ", Remaining Loan Balance: " + loanBalance + ", New Account Balance: " + balance);
            System.out.println("Loan repayment successful.");
        } else if (amount > loanBalance) {
            System.out.println("You are trying to repay more than your loan balance.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance to repay loan.");
        } else {
            System.out.println("Invalid repayment amount.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void saveAccount(){
        try{
           File file = new File("Accountdeatils.txt");
         if(file.createNewFile()){
            System.out.println("File 'account.txt created");
         }
         FileWriter Fw = new FileWriter(file, true);
         Fw.write("Name "+ accountHolderName+ "/n");
         Fw.write("Account Number: "+ balance+ "\n");
         Fw.write("Balance RS"+ balance+ "\n");
         System.out.println("file account txt is created");

        }catch(Exception e){
            
        }
     
    }
    public void saveTransactionHistory(){

    }
}

class BackAccount {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, CreateBankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {

      try{
        File file =new File("Example.txt");
        FileWriter writer  = new FileWriter("Example.txt");
        writer.write("ATM Trancsaction History");
        writer.close();

        if(file.createNewFile()){
            System.out.println("File created"+file.getName());
        }else{
            System.out.println("File Already exits");
        }

      }catch(Exception e){

      }



        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Transaction History");
            System.out.println("6. Show Total Bank Balance");
            System.out.println("7. Take Loan");
            System.out.println("8. View Loan Balance");
            System.out.println("9. Repay Loan");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    CreateBankAccount newAccount = new CreateBankAccount(name);
                    accounts.put(newAccount.getAccountNumber(), newAccount);
                    System.out.println("Account created! Your account number is: " + newAccount.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter your account number: ");
                    int accNum2 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc2 = accounts.get(accNum2);
                    if (acc2 != null) {
                        System.out.println("Account Number: " + acc2.getAccountNumber());
                        System.out.println("Current Balance: " + acc2.getBalance());
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter your account number: ");
                    int accNum3 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc3 = accounts.get(accNum3);
                    if (acc3 != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        acc3.deposit(amount);
                        System.out.println("Total Bank Balance: " + getTotalBankBalance());
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter your account number: ");
                    int accNum4 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc4 = accounts.get(accNum4);
                    if (acc4 != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        acc4.withdraw(withdrawAmount);
                        System.out.println("Total Bank Balance: " + getTotalBankBalance());
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter your account number: ");
                    int accNum5 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc5 = accounts.get(accNum5);
                    if (acc5 != null) {
                        acc5.printTransactionHistory();
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 6:
                    System.out.println("Total Bank Balance: " + getTotalBankBalance());
                    break;
                case 7:
                    System.out.print("Enter your account number: ");
                    int accNum7 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc7 = accounts.get(accNum7);
                    if (acc7 != null) {
                        System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        acc7.takeLoan(loanAmount);
                        System.out.println("Current Loan Balance: " + acc7.getLoanBalance());
                        System.out.println("Total Bank Balance: " + getTotalBankBalance());
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 8:
                    System.out.print("Enter your account number: ");
                    int accNum8 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc8 = accounts.get(accNum8);
                    if (acc8 != null) {
                        System.out.println("Current Loan Balance: " + acc8.getLoanBalance());
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 9:
                    System.out.print("Enter your account number: ");
                    int accNum9 = scanner.nextInt();
                    scanner.nextLine();
                    CreateBankAccount acc9 = accounts.get(accNum9);
                    if (acc9 != null) {
                        System.out.print("Enter amount to repay: ");
                        double repayAmount = scanner.nextDouble();
                        acc9.repayLoan(repayAmount);
                        System.out.println("Current Loan Balance: " + acc9.getLoanBalance());
                        System.out.println("Total Bank Balance: " + getTotalBankBalance());
                    } else {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 10:
                    System.out.println("Thank you for using the banking system!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static double getTotalBankBalance() {
        double total = 0.0;
        for (CreateBankAccount acc : accounts.values()) {
            total += acc.getBalance();
        }
        return total;
    }
}