package Chapter5.Exercise;

/*
5.16 (Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks.
For example, if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.
 */


import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        StringBuilder save = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            number = input.nextInt();
            save.append(number);
        }
        int retrievedNumber = Integer.parseInt(String.valueOf(save));
        for(int a = 0; a < 5; a++){
            double individualDigits = retrievedNumber % Math.pow(10, a+1) / Math.pow(10, a);
            System.out.print((int)individualDigits);
            System.out.print("\t");
            for(int c = 1; c <= (int) individualDigits; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
