package Chapter6.Exercise;

/*
6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.
 */


import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(int hour){
        double charge = 2.00;
        if(hour == 24)
            charge = 10.00;
        else if(hour >= 4 && hour < 24){
            for(int i = 4; i <= hour; i++){
                charge += 0.5;
            }
        }
        else if(hour > 0 && hour < 4){
            return charge;
        }
        return charge;
    }

    public static void main(String[] args) {
        System.out.println("How many hours was the customer's car parked?");
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int count = 1;
        double total = 0;
        while(hour > 0) {
            calculateCharges(hour);
            total += calculateCharges(hour);
            System.out.println("Customer " + count + " was parked for "
                    + hour + " hours and paid a sum of $" + calculateCharges(hour));
            count++;
            System.out.println("How many hours was the customer's car parked?");
            hour = input.nextInt();
        }

        System.out.println("The total money accumulated from parking is $" + total);
    }
}
