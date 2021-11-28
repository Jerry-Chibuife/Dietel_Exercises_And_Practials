package Chapter2.Exercise;/* 2.25 (Divisible by 3) Write an application that reads an integer and determines and prints
whether it’s divisible by 3 or not. 
[Hint: Use the remainder operator. A number is divisible by 3 if it’s divided by 3 with a remainder of 0.] */


import java.util.Scanner;
public class Display8 {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int d = a % 3;
		int e = b % 3;
		int f = c % 3;

		if(d == 0){
			System.out.printf("This number, %d, is divisible by 3", a);
		}
		else if(d != 0){
			System.out.printf("This number, %d, is not divisible by 3", a);
		}
		
		System.out.println();

		if(e == 0){
			System.out.printf("This number, %d, is divisible by 3", b);
		}
		else if(e != 0){
			System.out.printf("This number, %d, is not divisible by 3", b);
		}

		System.out.println();

		if(f == 0){
			System.out.printf("This number, %d, is divisible by 3", c);
		}
		else if(f != 0){
			System.out.printf("This number, %d, is not divisible by 3", c);
		}
	}
}