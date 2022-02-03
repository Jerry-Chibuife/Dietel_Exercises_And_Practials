package Chapter6.Exercise;

/*
6.20 (Test for Leap Year) Write an application that prompts the user to enter a year
and uses a method called isLeapYear to check whether it is a leap year.
*/


public class TestForLeapYear {


    public static boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
}
