package Chapter2.Exercise;/* 2.32 (Negative, Positive and Zero Values)
Write a program that inputs five numbers and determines and prints the number of negative numbers input, 
the number of positive numbers input and the number of zeros in the input */


import java.util.Scanner;

public class Integer{

	public static void main(String s[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input.nextInt();
		System.out.println("Enter a number");
		int b = input.nextInt();
		System.out.println("Enter a number");
		int c = input.nextInt();
		System.out.println("Enter a number");
		int d = input.nextInt();
		System.out.println("Enter a number");
		int e = input.nextInt();

		int negative = 0;
		int positive = 0;
		int zero = 0;

		if(a > 0){
			positive += 1;
		}
		if(a == 0){
			zero += 1;
		}
		if(a < 0){
			negative += 1;
		}

		if(b > 0){
			positive += 1;
		}
		if(b == 0){
			zero += 1;
		}
		if(b < 0){
			negative += 1;
		}

		if(c > 0){
			positive += 1;
		}
		if(c == 0){
			zero += 1;
		}
		if(c < 0){
			negative += 1;
		}

		if(d > 0){
			positive += 1;
		}
		if(d == 0){
			zero += 1;
		}
		if(d < 0){
			negative += 1;
		}

		if(e > 0){
			positive += 1;
		}
		if(e == 0){
			zero += 1;
		}
		if(e < 0){
			negative += 1;
		}


		System.out.println("The number of positive numbers is "+ positive);
		System.out.println("The number of negative numbers is "+ negative);
		System.out.println("The number of numbers equal to zero is "+ zero);
	}
}