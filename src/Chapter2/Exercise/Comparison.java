package Chapter2.Exercise;/* 2.16 (Comparing Integers) Write an application that asks the user to enter one integer,
obtains it from the user and displays whether the number and its square are greater than, 
equal to, not equal to, or less than the number 100. Use the techniques shown in Fig. 2.15. */


import java.util.Scanner;
public class Comparison{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int a = 100;
		int b = input.nextInt();
		int c = b * b;

		if(b > a)
			if(c > a)
				System.out.println("This numbers are greater than 100");

		if(b == a)
			if(c == a)
				System.out.println("This numbers are equal to 100");

		if(b != a)
			if(c != a)
				System.out.println("This numbers are not equal to 100");

		if(b < a)
			if(c < a)
				System.out.println("This numbers are less than 100");


	}
}