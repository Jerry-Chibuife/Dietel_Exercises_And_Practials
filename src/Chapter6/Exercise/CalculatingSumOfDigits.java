package Chapter6.Exercise;

/*
6.26 (Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
returns the sum of the digits. For example, given the number 7631, the method should return 17.
Incorporate the method into an application that reads a value from the user and displays the result.
 */


public class CalculatingSumOfDigits {


    public static int addUpDigitsInANumber(int number){
        int total = 0;
        for(int i = 1; i <= String.valueOf(number).length(); i++){
            total += Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i-1)));
        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println(addUpDigitsInANumber(7631));
    }
}
