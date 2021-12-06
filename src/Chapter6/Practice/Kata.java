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


}
