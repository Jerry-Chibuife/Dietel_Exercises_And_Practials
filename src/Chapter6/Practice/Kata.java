package Chapter6.Practice;

import java.util.Scanner;

public class Kata {

    public static String grading(int score){

        String grade = "";
        if(score >= 90)
            if(score <= 100)
                grade = "A";

        if(score >= 80)
            if(score <= 89)
                grade = "B";
        if(score >= 70)
            if(score <= 79)
                grade = "C";
        if(score >= 60)
            if(score <= 69)
                grade = "D";
        if (score >= 50)
            if(score <= 59)
                grade = "E";
        if(score <= 49)
            grade = "F";
        if(score > 100)
            grade = "Error. Score is wrong";
        if(score < 0)
            grade = "Error. Score is wrong";

        return grade;
    }


    public static int calculateTotalOf(int[] numbers) {
        int[] result = numbers;
        int total = 0;
        for(int i = 0; i < result.length; i++){
            total += result[i];
        }
        return total;
    }

    public static int calculateMinimumOf(int[] minimum) {
        int[] result = minimum;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < result.length; i++){
            if(min > result[i]){
                min = result[i];
            }
        }
        return min;
    }

    public static int calculateMaximumOf(int[] maximum) {
        int[] result = maximum;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < result.length; i++){
            if(max < result[i]){
                max = result[i];
            }
        }
        return max;
    }

    public static double calculateAverageOf(int[] average) {
        int[] result = average;
        int total = 0;
        for(int i = 0; i < result.length; i++){
            total += result[i];
        }
        double avg = (double) total / result.length;
        return avg;
    }
}
