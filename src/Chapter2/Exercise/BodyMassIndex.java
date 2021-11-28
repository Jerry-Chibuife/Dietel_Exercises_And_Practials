package Chapter2.Exercise;/* 2.33 (Body Mass Index Calculator)
We introduced the body mass index (BMI) calculator in Exercise 1.10. 
The formulas for calculating BMI are 4 2 3 3 9 number square cube 0 0 0 1 1 1 2 4 8 3 9 27 
4 16 64 5 25 125 6 36 216 7 49 343 8 64 512 9 81 729 10 100 1000. 
Create a BMI calculator that reads the user’s weight in pounds and height in inches 
(or, if you prefer, the user’s weight in kilograms and height in meters), then calculates 
and displays the user’s body mass index. Also, display the BMI categories and 
their values from the National Heart Lung and Blood Institute so the user can evaluate 
his/her BMI. [Note: In this chapter, you learned to use the int type to represent 
whole numbers. The BMI calculations when done with int values will both produce 
whole-number results. In Chapter 3 you’ll learn to use the double type to represent numbers 
with decimal points. When the BMI calculations are performed with doubles, 
they’ll both produce numbers with decimal points—these are called "floating-point" numbers.] */ 



/* Ask for user's weight in kilograms
Ask for user's height in metres
Use formula to calculate BMI
display user's BMI
Display BMI categories */



import java.util.Scanner;
public class BodyMassIndex{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your weight in kilogram: ");
		int weight = input.nextInt();
		System.out.println("Please enter your height in metres: ");
		int height = input.nextInt();

		int index = weight / (height * height);
		System.out.printf("Your BMI is: %d%n", index);

		System.out.printf("The BMI categories are as follows: %n Underweight = < 18.5 %n Normal weight = 18.5-24.9 %n Overweight = 25-29.9 %n Obesity = BMI of 30 or greater %n");
		
	}
}
