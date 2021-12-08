package Chapter7.Practice;

import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        double average;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter a new score: ");
            scores[i] = input.nextInt();

            total = total + scores[i];
            if (min > scores[i]) {
                min = scores[i];
            }
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        for (int c = 0; c < scores.length; c++) {
            System.out.print(scores[c] + " ");
        }

        System.out.println();

        average = total / 10.0;
        System.out.println("The total score is: " + total);
        System.out.println("The average score is: " + average);
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
    }
}
