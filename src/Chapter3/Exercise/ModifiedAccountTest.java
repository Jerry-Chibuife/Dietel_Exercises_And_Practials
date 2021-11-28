package Chapter3.Exercise;

import java.util.Scanner;
public class ModifiedAccountTest{

	public static void main(String[] args) {

		ModifiedAccount account1 = new ModifiedAccount("Jerry Chibuife", 1000.00);

		System.out.printf("%s has balance of: $%.2f%n", account1.getName(), account1.getBalance());
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s has balance of: $%.2f%n", account1.getName(), account1.getBalance());

		System.out.print("Enter withdrawal amount for account1: ");
		double withdraw = input.nextDouble();
		System.out.printf("%nSubtracting %.2f from account1 balance%n%n", withdraw);
		account1.withdraw(withdraw);

		System.out.printf("%s has balance of: $%.2f%n", account1.getName(), account1.getBalance());
	}
}