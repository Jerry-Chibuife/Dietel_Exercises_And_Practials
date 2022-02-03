package Chapter6.Exercise;

/*
6.22 (Temperature Conversions) Implement the following integer methods:
a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calculation
Kelvin = Celsius + 273.15;
b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the calculation
Celsius = Kelvin - 273.15;
c) Use the methods from parts (a) and (b) to write an application that enables the user to
enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
temperature and display the Kelvin equivalent.
*/


import java.util.Scanner;

public class TemperatureConversion {


    public static double convertCelsiusToKelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double convertKelvinToCelsius(double kelvin){
        double celsius = kelvin - 273.15;
        return celsius;
    }

    public static void main(String[] args) {
        System.out.print("""
                To convert from Celsius to Kelvin, Press 1
                To convert from Kelvin to Celsius, Press 2
                To end this program, Press 0
                Enter here: """);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while(choice != 0)
            if(choice == 1){
                System.out.println();
                System.out.print("What degree in Celsius would you like to convert to Kelvin? Enter here: ");
                double degreeInCelsius = input.nextDouble();
                System.out.println(convertCelsiusToKelvin(degreeInCelsius));
                System.out.println();
                System.out.print("""
                To convert from Celsius to Kelvin, Press 1
                To convert from Kelvin to Celsius, Press 2
                To end this program, Press 0
                Enter here: """);
                choice = input.nextInt();
            }
            else if(choice == 2){
                System.out.println();
                System.out.println("What degree in Kelvin would you like to convert to Celsius? Enter here: ");
                double degreeInKelvin = input.nextDouble();
                System.out.println(convertKelvinToCelsius(degreeInKelvin));
                System.out.println();
                System.out.print("""
                To convert from Celsius to Kelvin, Press 1
                To convert from Kelvin to Celsius, Press 2
                To end this program, Press 0
                Enter here: """);
                choice = input.nextInt();
            }
            else{
                System.out.println();
                System.out.println("Invalid command. Try again");
                System.out.println();
                System.out.print("""
                To convert from Celsius to Kelvin, Press 1
                To convert from Kelvin to Celsius, Press 2
                To end this program, Press 0
                Enter here: """);
                choice = input.nextInt();
            }
    }
}
