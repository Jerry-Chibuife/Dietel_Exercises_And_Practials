package Chapter2.Exercise;/* 2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this chapter,
write an application that calculates the squares and cubes of the numbers from 0 to 10 
and prints the resulting values in table format, as shown below. */


public class Table{

	public static void main(String[] args){

		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		int e = 4;
		int f = 5;
		int g = 6;
		int h = 7;
		int i = 8;
		int j = 9;
		int k = 10;

		System.out.println("Number\t Square\t Cube");

		System.out.printf("%d\t %d\t %d%n", a, a*a, a*a*a);
		System.out.printf("%d\t %d\t %d%n", b, b*b, b*b*b);
		System.out.printf("%d\t %d\t %d%n", c, c*c, c*c*c);
		System.out.printf("%d\t %d\t %d%n", d, d*d, d*d*d);
		System.out.printf("%d\t %d\t %d%n", e, e*e, e*e*e);
		System.out.printf("%d\t %d\t %d%n", f, f*f, f*f*f);
		System.out.printf("%d\t %d\t %d%n", g, g*g, g*g*g);
		System.out.printf("%d\t %d\t %d%n", h, h*h, h*h*h);
		System.out.printf("%d\t %d\t %d%n", i, i*i, i*i*i);
		System.out.printf("%d\t %d\t %d%n", j, j*j, j*j*j);
		System.out.printf("%d\t %d\t %d%n", k, k*k, k*k*k);
		

	}
}