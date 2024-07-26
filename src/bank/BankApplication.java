package bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankApplication {
    private static Map<String, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBank Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountHolderName);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.displayBalance();
        } else {
            System.out.println("Account not found.");
        }
    }
}
