import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to input account details
        String customerCode;
        do {
            System.out.print("Enter customer code: ");
            customerCode = sc.nextLine();
        } while (customerCode.length() != 5);

        int accNumber;
        do {
            System.out.print("Enter account number: ");
            accNumber = sc.nextInt();
        } while (accNumber < 100000 || accNumber > 999999 || accNumber / 100000 != 100);

        // Create account object
        Account account = new Account(customerCode, accNumber);
        System.out.println("Account created successfully!");
    }
}