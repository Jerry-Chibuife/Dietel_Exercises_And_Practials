package Chapter3.Exercise;

import java.util.Scanner;

public class Petrol{

	public static void main(String[] args) {

		PetrolPurchase firstPurchase = new PetrolPurchase("Yaba", "Dilluted", 15, 150.00, 0.05);
		
		System.out.printf("%nThe place at %s sold %s %d litres of petrol for %.2f per litre, with %f percent discount %n", firstPurchase.getStationLocation(), firstPurchase.getPetrolType(), firstPurchase.getQuantityInLitre(), firstPurchase.getPriceInLitre(), firstPurchase.getPercentageDiscount());

		Scanner input = new Scanner(System.in);

		System.out.printf("%nThis the net purchase amount, %.2f", firstPurchase.getPurchaseAmount());



	}
}