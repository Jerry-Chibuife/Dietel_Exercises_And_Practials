package Chapter4.Exercise;

/*
4.32 (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs
an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint:
Use the remainder and division operators to pick off the binary number’s digits one at a time, from
right to left. In the decimal number system, the rightmost digit has a positional value of 1 and the
next digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number
234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit
has a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so
on. The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
 */


import java.util.Scanner;

public class PrintingTheDecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number containing only 1's and 0's: ");
        Scanner input = new Scanner(System.in);
        int binaryNumber = input.nextInt(2);

    }
}
