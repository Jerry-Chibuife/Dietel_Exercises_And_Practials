package Chapter4.Exercise;

/*
4.36 (Creating a Comparator) Write an application that works as a comparator. Your program
should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
number is greater, and –1 if the second number is greater.
 */


import java.util.Scanner;

public class CreatingAComparator {
    public static void main(String[] args) {
        System.out.println("Enter numbers to compare:");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        if(firstNumber == secondNumber)
            System.out.println("0");
        if(firstNumber > secondNumber)
            System.out.println("1");
        if(firstNumber < secondNumber)
            System.out.println("-1");
    }
}
