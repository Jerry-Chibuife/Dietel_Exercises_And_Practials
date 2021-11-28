package Chapter2.Exercise;/* 2.15 (Arithmetic) Write an application that asks the user to enter two integers,
obtains them from the user and prints the square of each, the sum of their squares, 
and the difference of the squares (first number squared minus the second number squared). 
Use the techniques shown in Fig. 2.7. */


import java.util.Scanner;
public class Algebra{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int a = input.nextInt();
		System.out.println("Enter the second integer: ");
		int b = input.nextInt();

		int c = a * a;
		int d = b * b;
		int e = (a * a) + (b * b);
		int f = (a * a) - (b * b);

		System.out.printf("The square of integer a is %n%d%n", c);
		System.out.printf("And the square of integer b is %n%d%n", d);
		System.out.printf("The sum of the squares of integer a and b is %n%d%n", e);
		System.out.printf("And the difference of the squares of integer a and b is %n%d%n", f);
	}
}