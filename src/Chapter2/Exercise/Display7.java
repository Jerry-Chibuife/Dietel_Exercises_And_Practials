package Chapter2.Exercise;/* 2.24 (Largest and Smallest Integers)
Write an application that reads five integers and determines and prints the largest 
and smallest integers in the group. 
Use only the programming techniques you learned in this chapter. */

import java.util.Scanner;
public class Display7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
		if(a > b)
			if(a > c)
				if(a > d)
					if(a > e)
						System.out.printf("This number, %d, is the largest number", a);
		
		if(b > a)
			if(b > c)
				if(b > d)
					if(b > e)
						System.out.printf("This number, %d, is the largest number", b);

		if(c > b)
			if(c > a)
				if(c > d)
					if(c > e)
						System.out.printf("This number, %d, is the largest number", c);

		if(d > b)
			if(d > c)
				if(d > a)
					if(d > e)
						System.out.printf("This number, %d, is the largest number", d);

		if(e > b)
			if(e > c)
				if(e > d)
					if(e > a)
						System.out.printf("This number, %d, is the largest number", e);
		System.out.println();

		if(a < b)
			if(a < c)
				if(a < d)
					if(a < e)
						System.out.printf("This number, %d, is the smallest number", a);

		if(b < a)
			if(b < c)
				if(b < d)
					if(b < e)
						System.out.printf("This number, %d, is the smallest number", b);

		if(c < b)
			if(c > a)
				if(c < d)
					if(c < e)
						System.out.printf("This number, %d, is the smallest number", c);

		if(d < b)
			if(d < c)
				if(d < a)
					if(d < e)
						System.out.printf("This number, %d, is the smallest number", d);

		if(e < b)
			if(e < c)
				if(e < d)
					if(e < a)
						System.out.printf("This number, %d, is the smallest number", e);
		
	}
}
