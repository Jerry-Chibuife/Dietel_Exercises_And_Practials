package Chapter4.Exercise;
/*
4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers
has exceeded the credit limit on a charge account. For each customer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should
display the message "Credit limit exceeded".
*/


import java.util.Scanner;

/*
Set entries as integers. Entries are the facts specified in the question
Use a repeating system to account for unknown number of customers
Solve for new balance and display
If new balance is greater than credit limit, display "Credit limit exceeded".
*/
public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number. [Note: Account numbers are 10 digits ONLY]");
        long accountNumber = input.nextLong();
        System.out.println("Enter your current account balance");
        int initialBalance = input.nextInt();
        System.out.println("Enter the total price of the items you bought");
        int totalPriceOfItemsCharged = input.nextInt();
        System.out.println("Enter the total amount of credit applied to goods purchased");
        int totalCreditApplied = input.nextInt();
        System.out.println("Enter your credit limit");
        int creditLimit = input.nextInt();

        int customer = 1;

        while(initialBalance != 0){

            int newBalance = initialBalance + totalPriceOfItemsCharged - totalCreditApplied;
            if(newBalance < creditLimit){
                System.out.printf("This is the new balance, $%d, for customer %d of account number %d%n", newBalance, customer, accountNumber);
            }
            if(newBalance > creditLimit){
                System.out.printf("This is the new balance, $%d, for customer %d of account number %d%n", newBalance, customer, accountNumber);
                System.out.println("Credit limit exceeded");
            }

            customer++;

            System.out.println("Enter your account number. [Note: Account numbers are 10 digits ONLY]");
            accountNumber = input.nextInt();
            System.out.println("Enter your current account balance");
            initialBalance = input.nextInt();
            System.out.println("Enter the total price of the items you bought");
            totalPriceOfItemsCharged = input.nextInt();
            System.out.println("Enter the total amount of credit applied to goods purchased");
            totalCreditApplied = input.nextInt();
            System.out.println("Enter your credit limit");
            creditLimit = input.nextInt();
        }
    }
}
