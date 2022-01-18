package Chapter4.Exercise;


/*
4.30 (Right-angled Triangle) Write an application that prompts the user to enter the length of
the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
program should work for triangles of base lengths between 1 and 10.
 */


import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the base length of a triangle: ");
        Scanner input = new Scanner(System.in);
        int baseLength = input.nextInt();
        if(baseLength >= 1 && baseLength <= 10) {
            int count = baseLength + 4;
            for (int i = 1; i <= count; i++) {
                for (int k = 1; k <= i; k++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}
