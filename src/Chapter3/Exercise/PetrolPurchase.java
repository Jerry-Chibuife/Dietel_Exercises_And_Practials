package Chapter3.Exercise;/* 3.12 (Class PetrolPurchase)
Create a class called PetrolPurchase to represent information about the petrol you purchase. 
The class should include five pieces of information in the form of instance variables
—the station’s location (type String), the type of petrol (type String), 
the quantity (type int) of the purchase in liters, the price per liter (double), 
and the percentage discount (double). 
Your class should have a constructor that initializes the five instance variables. 
Provide a set and a get method for each instance variable. 
In addition, provide a method named getPurchaseAmount that calculates 
the net purchase amount (i.e., multiplies the quantity by the price per liter) 
minus the discount, then returns the net amount you had to pay as a double value. 
Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase. */


public class PetrolPurchase{

	private String location;
	private String petrol;
	private int quantity;
	private double price;
	private double discount;

	public PetrolPurchase(String location, String petrol, int quantity, double price, double discount){
		this.location = location;
		this.petrol = petrol;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}

	public void setStationLocation(String stationLocation){
		location = stationLocation;
	}

	public void setPetrolType(String petrolType){
		petrol = petrolType;
	}

	public void setQuantityInLitre(int quantityInLitre){
		quantity = quantityInLitre;
	}

	public void setPriceInLitre(double priceInLitre){
		price =  priceInLitre;
	}

	public void setPercentageDiscount(double percentageDiscount){
		discount = percentageDiscount;
	}


	public String getStationLocation() {
		return location;
	}

	public String getPetrolType() {
		return petrol;
	}

	public int getQuantityInLitre() {
		return quantity;
	}

	public double getPriceInLitre() {
		return price;
	}

	public double getPercentageDiscount() {
		return discount;
	}


	public double getPurchaseAmount(){
		double purchaseAmount = quantity * price - discount;
		return purchaseAmount;
	}


}