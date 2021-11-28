package Chapter3.Exercise;/* 3.13 (Car Class) Create a class called Car that includes three instance variables—a model (type String),
a year (type String), and a price (double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the price is not positive, do not set its value. 
Write a test application named CarApplication that demonstrates class Car’s capabilities. 
Create two Car objects and display each object’s price. 
Then apply a 5% discount on the price of the first car and a 7% discount on the price of the second. 
Display each Car’s price again. */


public class Car{

	private String model;
	private String year;
	private double price;

	public Car(String model, String year, double price){
		this.model = model;
		this.year = year;
		this.price = price;

	}

	public void setModel(String carName){
		model = carName;
	}

	public void setYear(String productionDate){
		year = productionDate;
	}

	public void setPrice(double salePrice){
		price = salePrice;
	}


	public String getModel(){
		return model;
	}

	public String getYear(){
		return year;
	}

	public double getPrice(){
		return price;
	}


	public void price(double price){
		if(price < 0){
			price = 0;
		}
	}
}