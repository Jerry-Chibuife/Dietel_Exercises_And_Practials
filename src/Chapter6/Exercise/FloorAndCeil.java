package Chapter6.Exercise;

/*
6.14 (Floor and Ceil) Write two methods myFloor and myCeil that take a positive double num
variable int myFloor(double num) and int myCeil(double num).
The myFloor method takes num and returns the largest integer number that is less than or equal to x.
The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
not use any Math class methods. Incorporate this method into an application that sends a double
value to the functions and tests their ability to calculate the required out-put.
 */


import java.util.Scanner;

public class FloorAndCeil {
    public static int myFloor(double number){
        int value = 0;
        if(number > 0.0)
            value = (int)number + 1;
        return value;
    }
    public static int myCeil(double number){
        int value = 0;
        if(number > 0.0)
            value = (int) number;
        return value;
    }

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        while(number != 0){
            System.out.println(number + " ---> " + myFloor(number)
                    + " | " + myCeil(number));
            System.out.print("Enter a decimal number: ");
            number = input.nextDouble();
        }
    }
}
