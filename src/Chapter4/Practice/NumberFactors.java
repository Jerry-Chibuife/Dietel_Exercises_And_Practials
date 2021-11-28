package Chapter4.Practice;

import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int factorTotal = 0;
        int divisor = 1 ;
        while(divisor <= number){
            int factor = number / divisor;
            int factorRemainder = number % divisor;
            if(factorRemainder == 0){
                System.out.print(factor+ " ");
                factorTotal += 1;

            }
            divisor++;
        }
        System.out.println();
        System.out.println("The number of factors is "+ factorTotal);
    }
}
