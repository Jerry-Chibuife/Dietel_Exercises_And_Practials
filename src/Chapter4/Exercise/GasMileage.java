package Chapter4.Exercise;
/* 4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user. */

/*
Set a way for user to input miles driven and gallons used for each trip
 Calculate miles per gallon for eac trip
 Display miles per gallon for eac trip
 Set averaging calculations to hold decimal results
 use sentinel controlled iteration*/

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you drove: [Note: To end program, enter -1]");
        int milesDriven = input.nextInt();
        System.out.println("Enter the number of fuel gallons used: [Note: To end program, enter -1]");
        int gallonsUsed = input.nextInt();
        double milesPerGallon = (double) milesDriven / gallonsUsed;
        double totalMilesPerGallon = 0;
        int trip = 1;

        while( milesDriven != -1 || gallonsUsed != -1){
            milesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("The miles per gallon for trip %d is %.2f%n", trip, milesPerGallon);
            totalMilesPerGallon += milesPerGallon;
            trip = trip + 1;
            System.out.println("Enter the number of miles you drove: [Note: To end program, enter -1]");
            milesDriven = input.nextInt();
            System.out.println("Enter the number of fuel gallons used: [Note: To end program, enter -1]");
            gallonsUsed = input.nextInt();
        }

        System.out.printf("The combined miles per gallon obtained from all trips is %.2f%n", totalMilesPerGallon);
    }
}
