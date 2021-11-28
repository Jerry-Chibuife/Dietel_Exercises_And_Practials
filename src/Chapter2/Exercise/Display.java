package Chapter2.Exercise;/* 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user
and displays the sum, average, product, smallest and largest of the numbers. 
Use the techniques shown in Fig. 2.15. 
[Note: The calculation of the average in this exercise should result in an integer representation of the average. 
So, if the sum of the values is 7, the average should be 2, not 2.3333….] */


import java.util.Scanner;
public class Display{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		System.out.println("Enter third number: ");
		int c = input.nextInt();
		int d = (a + b + c) / 3;
		System.out.printf("The sum of the numbers is %d%n", a + b + c);
		System.out.printf("The average of these numbers is %d%n", d);
		System.out.printf("The product of the numbers is %d%n", a * b * c);
		

	}
}