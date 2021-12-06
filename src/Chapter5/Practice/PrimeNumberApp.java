package Chapter5.Practice;

import java.util.Scanner;

public class PrimeNumberApp {
    public static void main(String[] args) {
        calculatePrimeNumber();
        isEven(87);
    }

    public static int calculateFactorsOf(int userInput){
        int factors = 0;
        for(int number = 1; number <= userInput; number++){
            if(userInput % number == 0) factors++;
        }
        return factors;
    }

    public static void calculatePrimeNumber(){
        System.out.println("Enter a number: ");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();
        int result = calculateFactorsOf(userInput);

        if(result == 2)
            System.out.printf("%d is a prime number", userInput);
        else System.out.printf("%d is not a prime number", userInput);
    }

    public static void isEven(int userInput){
        if(userInput % 2 == 0)
            System.out.println("Yes! It is even");
        else System.out.println("No! It is not even");
    }
}
