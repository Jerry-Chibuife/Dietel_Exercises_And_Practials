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

        SalesCommissionCalculator worker1 = new SalesCommissionCalculator();
        double salary = worker1.salary();
        double grossEarnings = 0;

        Scanner input = new Scanner(System.in);
        double grossPay = worker1.grossSales(input.nextInt());
        while(input.nextInt() != 0){
            grossEarnings += grossPay;
            System.out.println(grossEarnings);
            //grossPay = worker1.grossSales(input.nextInt());
        }
        //double totalEarnings = salary + grossEarnings;
        //System.out.println("This is the gross earnings of worker 1: #" + totalEarnings);
    }

    public double salary(){
        double salary = 200;
        return salary;
    }

    public double grossSales(int item){
        double gross;
        while(item > 0 && item < 5) {
            if (item == 1) {
                return gross = 239.99;
            }
            if (item == 2) {
                return gross = 129.75;
            }
            if (item == 3) {
                return gross = 99.95;
            }
            if (item == 4) {
                return gross = 350.89;
            }
        }
        return gross = 0;
    }
}
