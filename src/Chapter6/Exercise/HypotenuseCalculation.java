package Chapter6.Exercise;

/*
6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given.
The method should take two arguments of type double and return the hypotenuse as a double.
Incorporate this method into an application that reads values for side1 and side2
and performs the calculation with the hypotenuse method.
Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14.
[Note: Class Math also provides method hypot to perform this calculation.]
 */


import java.util.Scanner;

public class HypotenuseCalculation {

    public static double calculateTheHypotenuseOfAGivenTriangle(double side1, double side2){
        double answer = Math.hypot(side1, side2);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of the first side, in decimal: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the value of the second side, in decimal: ");
        double side2 = input.nextDouble();

        System.out.printf("The hypotenuse of the triangle of sides %.1f and %.1f is %.2f", side1, side2,
                calculateTheHypotenuseOfAGivenTriangle(side1, side2));
    }
}
