package Chapter2.Exercise;// 2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Use the following techniques:
// a) Use one System.out.println statement. 
// b) Use four System.out.print statements. 
// c) Use one System.out.printf statement. 


public class NumberReader {

	public static void main(String[] args){

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;

		System.out.print(num1);
		System.out.println();
		System.out.printf("%d%n", num2);
		System.out.println(num3);
		System.out.println(num4);

	}
}