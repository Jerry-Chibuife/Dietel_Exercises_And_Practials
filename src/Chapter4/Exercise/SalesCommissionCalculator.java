package Chapter4.Exercise;
/*
4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings.
There’s no limit to the number of items that can be sold.
*/


/*

*/


import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double total = 0;
        System.out.println("Enter a number between 1-4. Enter -1 to exit loop");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        while(sales != -1 && sales > 0 && sales < 5){
            if(sales == 1)
                total += 239.99;
            else if(sales == 2)
                total += 129.75;
            else if(sales == 3)
                total += 99.95;
            else if(sales == 4)
                total += 350.89;
            else System.out.println("Invalid value");
            sales = input.nextInt();
        }
        total *= 0.09;
        total += 200;
        System.out.printf("The salesperson's earnings for the week is %.2f dollars",total);
    }
}
//w3resource.com/java-exercises