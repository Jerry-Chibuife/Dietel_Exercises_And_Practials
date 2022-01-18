package Chapter4.Exercise;

/*
4.34 (Reading numbers until a specified sum) Write an application that asks for a number from
the user and then keeps reading integer values from the user until the sum of those integers equals
or becomes greater than the value that was input in the beginning.
 */


import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int firstNumber = number;
        int total = 0;
        while(total < firstNumber){
            number = input.nextInt();
            total += number;
            if(total >= firstNumber)
                System.out.println("This number, " + total + " is greater than or equal to the first number, " + firstNumber);
        }

    }
}
