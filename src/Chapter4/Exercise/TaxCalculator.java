package Chapter4.Exercise;

/*
4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and display the citizen’s total tax.
Use class Scanner to input the data.
 */


import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 3){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the name of the citizen: ");
            String personName = input.nextLine();
            System.out.println("Enter the citizen's total annual earnings: ");
            double personEarnings = input.nextInt();
            double tax = 0;
            if(personEarnings > 0 && personEarnings <= 30000)
                tax = personEarnings * 0.15;
            else if(personEarnings > 30000)
                tax = personEarnings * 0.2;
            else System.out.println("Invalid annual earnings. Earnings should be positive values.");
            System.out.printf("(Mr/Mrs/Miss) %s paid total tax of %.2f dollars", personName, tax);
            System.out.println();
            counter++;
        }
    }
}
