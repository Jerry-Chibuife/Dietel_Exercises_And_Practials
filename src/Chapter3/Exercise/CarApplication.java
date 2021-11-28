package Chapter3.Exercise;

import java.util.Scanner;

public class CarApplication {

	public static void main(String[] args){

		Car vehicle1 = new Car("Chrysler 300s", "January 2020", 97_000.00);
		Car vehicle2 = new Car("Mercedes-Benz AMG GT", "May 2014", 111_200.00);
		System.out.printf("%nThis car, the %s, made in %s is for sale at %.2f", vehicle1.getModel(), vehicle1.getYear(), vehicle1.getPrice());	
		System.out.printf("%nThis car, the %s, made in %s is for sale at %.2f", vehicle2.getModel(), vehicle2.getYear(), vehicle2.getPrice());
		
		System.out.println();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the percentage discount: ");
		double discount1 = input.nextDouble();
		System.out.printf("The final price after discount for %s is %.2f", vehicle1.getModel(), vehicle1.getPrice() - discount1 * vehicle1.getPrice());
		System.out.println();
		System.out.println("Enter the percentage discount: ");
		double discount2 = input.nextDouble();
		System.out.printf("The final price after discount for %s is %.2f", vehicle2.getModel(), vehicle2.getPrice() - discount2 * vehicle2.getPrice());		

	}
}