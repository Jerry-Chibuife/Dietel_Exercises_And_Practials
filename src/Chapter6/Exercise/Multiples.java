package Chapter6.Exercise;

/*
6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.
*/


import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int firstNumber, int secondNumber){
        return firstNumber % secondNumber == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println(isMultiple(firstNumber, secondNumber));
    }
}
