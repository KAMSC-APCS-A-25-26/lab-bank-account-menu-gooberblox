import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality

        double balance = 0, amount;
        int choice;
        Scanner scan = new Scanner(System.in);
        // actual stuff
        while(true) {

            System.out.println("---Bank Account Menu---");
            System.out.println("1. Add Money\n2. Withdrawal Money\n3. Check Balance\n4. Exit");
            choice = scan.nextInt();

            if (choice == 4) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to add: ");
                    amount = scan.nextDouble();
                    if(amount < 0) {
                        System.out.println("Err, can't add a negative amount");
                    } else {

                    
                    balance+=amount;
                    System.out.println("Successfully added $"+amount);
                    System.out.println("New balance: $"+balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdrawal");
                    amount = scan.nextDouble();
                    if(amount>balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        balance-=amount;
                        System.out.println("$"+amount+" withdrew.\nNew balance: $"+balance);
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $"+balance);
                    break;
            }
        }
    }
}
