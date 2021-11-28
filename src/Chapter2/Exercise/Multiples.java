package Chapter2.Exercise;/* 2.26 (Multiples) Write an application that reads two integers,
determines whether the first number tripled is a multiple of the second number doubled, 
and prints the result. [Hint: Use the remainder operator.] */


import java.util.Scanner;
public class Multiples {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		int c = a * a * a;
		System.out.printf("%d%n", c);
		int d = b * b;
		System.out.printf("%d%n", d);
		int e = c % d;

		if(e == 0){
			System.out.printf("%d is a multiple of %d", c, d);
		}
	}
}