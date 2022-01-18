package Chapter5.Exercise;

/*
5.12 (Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.
 */


import java.util.Scanner;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int sumOfNumbersDivisibleBy3 = 0;
        for (int i = 1; i < 30; i++){
            if(i % 3 == 0)
                sumOfNumbersDivisibleBy3 += i;
        }
        System.out.println("The sum of numbers between 1 and 30 divisible by 3 is " + sumOfNumbersDivisibleBy3);
    }
}
