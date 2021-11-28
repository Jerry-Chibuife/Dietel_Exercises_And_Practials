package Chapter5.Practice;

import java.util.Scanner;

public class GuessTheNumberModification {
    public static void main(String[] args) {

        int choice = (int) (Math.random() * 1000);
        int count = 0;

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

            count++;
            System.out.println("Guess again");
            tries = input.nextInt();
        }

        System.out.println("Congratulations. You guessed the correct number");
        if(count <= 10){
            System.out.println("Either you know the secret or you just got lucky!");
        }
        if(count == 10){
            System.out.println("Aha! You know the secret!");
        }
        if(count > 10){
            System.out.println("You should be able to do better!");
        }
    }
}
