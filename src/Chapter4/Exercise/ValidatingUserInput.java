package Chapter4.Exercise;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while(passes + failures != 10){
            System.out.print("Enter result: 1 for pass, 2 for fail: ");
            int result = input.nextInt();
            if(result == 1)
                passes += 1;
            else if(result == 2)
                failures += 1;
            else System.out.println("Invalid figure! Try again");
        }

        System.out.println("Passes: " + passes);
        System.out.println("Failures: " + failures);
    }
}

