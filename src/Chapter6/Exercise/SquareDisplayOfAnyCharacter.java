package Chapter6.Exercise;

import java.util.Scanner;

/*
6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to
receive a second parameter of type char called fillCharacter.
Form the square using the char provided as an argument.
Thus, if side is 5 and fillCharacter is #, the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
// next() returns a String and charAt(0) gets the String's first character
char fill = input.next().charAt(0);
 */
public class SquareDisplayOfAnyCharacter {


    public static void displayAnyCharacter(int number, char fillCharacter){
        String icon = String.valueOf(fillCharacter);
        for(int i = 1; i <= number; i++){
            System.out.println(icon.repeat(number));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides you fucking want: ");
        int side = input.nextInt();
        System.out.print("Enter what type of character you want to display: ");
        char character = input.next().charAt(0);
        System.out.println();
        displayAnyCharacter(side, character);
    }
}
