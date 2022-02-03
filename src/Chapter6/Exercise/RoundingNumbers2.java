package Chapter6.Exercise;

/*
6.10 (Rounding Numbers) To round numbers to specific decimal places, use a statement like
double y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position
(i.e., the first position to the right of the decimal point), or
double y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value,
the number rounded to the nearest integer, the number rounded to the nearest tenth,
the number rounded to the nearest hundredth and the number rounded to the nearest thousandth.
 */


import java.util.Scanner;

public class RoundingNumbers2 {
    public static int roundOffToInteger(double number){
        double value = Math.floor(number);
        int newValue = (int) value;
        return newValue;
    }
    public static double roundOffToTenths(double number){
        double value = Math.floor(number * 10) / 10;
        return value;
    }
    public static double roundOffToHundredths(double number){
        double value = Math.floor(number * 100)/ 100;
        return value;
    }
    public static double roundOffToThousandths(double number){
        double value = Math.floor(number * 1000) / 1000;
        return value;
    }


    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        while(number != 0){
            System.out.println(number + " ---> " + roundOffToInteger(number) + " | "
                    + roundOffToTenths(number ) + " | " + roundOffToHundredths(number)
                    + " | " + roundOffToThousandths(number));
            System.out.print("Enter a decimal number: ");
            number = input.nextDouble();
        }
    }
}
