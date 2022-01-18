package Chapter4.Exercise;

/*
4.31 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to enter a new value.
 */


import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        System.out.println("Enter a five-digit number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = String.valueOf(number).length();

        while (counter >= Integer.MIN_VALUE && counter <= Integer.MAX_VALUE){
            if(counter == 5) {
                if (number / 10000 == (number % 10) && (number % 10000) / 1000 == (number % 100) / 10) {
                    System.out.println("This number, " + number + " is a palindrome");
                } else {
                    System.out.println("This is not a palindrome");
                }
                break;
            }
            if(counter != 5) {
                System.out.println("Invalid figure. This " + number + " is not a five-digit number");
                number = input.nextInt();
                counter = String.valueOf(number).length();
            }
        }
    }
}
