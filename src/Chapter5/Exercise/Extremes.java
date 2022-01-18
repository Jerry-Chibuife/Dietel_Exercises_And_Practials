package Chapter5.Exercise;

/*
5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.
 */


import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter 10 numbers: ");
        for(int i = 1; i <= 10; i++){
            int numbers = input.nextInt();
            if(numbers > max)
                max = numbers;
            if(numbers < min)
                min = numbers;
        }
        int sumOfExtremes = max + min;
        System.out.println("This is the sum of the maximum number and minimum number: " + sumOfExtremes);
    }
}
