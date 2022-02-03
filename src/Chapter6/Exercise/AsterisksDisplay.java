package Chapter6.Exercise;

/*
6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side.
For example, if side is 4, the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.
*/


import java.util.Scanner;

public class AsterisksDisplay {


    public static void displayAsterisks(int number){
        String icon = "*";
        for(int i = 1; i <= number; i++){
            System.out.println(icon.repeat(number));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the number of sides you want: ");
        int side = input.nextInt();
        displayAsterisks(side);
    }
}
