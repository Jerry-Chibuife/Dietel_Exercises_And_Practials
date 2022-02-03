package Chapter6.Exercise;

/*
6.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
double y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y. Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.
 */


import java.util.Scanner;

public class RoundingNumbers {
    public static double roundOffDecimalNumberToInteger(double number){
        double value = Math.floor(number);
        return value;
    }

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        while(number != 0){
            System.out.println(number + " -->\t" + roundOffDecimalNumberToInteger(number));
            System.out.print("Enter a decimal number: ");
            number = input.nextDouble();
        }
    }
}
