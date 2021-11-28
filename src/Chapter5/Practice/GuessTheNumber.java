package Chapter5.Practice;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int choice = (int) (Math.random() * 1000);

        System.out.println("Guess the number the computer has chosen");
        Scanner input = new Scanner(System.in);
        int tries = input.nextInt();

        while(tries != choice){
            if(tries > choice){
                System.out.println("Too high. Try again");
            }
            if(tries < choice) {
                System.out.println("Too low. Try again");
            }

            System.out.println("Guess again");
            tries = input.nextInt();
        }

        System.out.println("Congratulations. You guessed the correct number");
    }
}
