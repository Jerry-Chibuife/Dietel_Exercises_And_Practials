package Chapter2.Exercise;/* 2.34 (World Population Growth Calculator)
Search the Internet to determine the current world population and 
the annual world population growth rate. Write an application that inputs these values, 
then displays the estimated world population after one, two, three, four and five years. */ 


/* Obtain value of current world population
Obtain value of annual world population
Multiply the annual world population growth rate and the current world population
Take value gotten and add it to the current world population (that is the estimated
population after a year)
Use the growth rate to multiply new value for current world population.
Value gotten should be added to the new value for current world population (that
is the estimated world population after 2 years) */


public class WorldPopulation{

	public static void main(String[] args){

		double currentWorldPopulation = 7906445633.00;
		double annualPopulationGrowthRate = 0.0105;

		double a = currentWorldPopulation * annualPopulationGrowthRate;

		double estimatedPopulationYear1 = currentWorldPopulation + a;
		System.out.printf("This is the estimated world population after 1 year: %.2f%n%n", estimatedPopulationYear1); 

		double b = estimatedPopulationYear1 * annualPopulationGrowthRate;
		double estimatedPopulationYear2 = estimatedPopulationYear1 + b;
		System.out.printf("This is the estimated world population after 2 years: %.2f%n%n", estimatedPopulationYear2);

		double c = estimatedPopulationYear2 * annualPopulationGrowthRate;
		double estimatedPopulationYear3 = estimatedPopulationYear2 + c;
		System.out.printf("This is the estimated world population after 3 years: %.2f%n%n", estimatedPopulationYear3);

		double d = estimatedPopulationYear3 * annualPopulationGrowthRate;
		double estimatedPopulationYear4 = estimatedPopulationYear3 + b;
		System.out.printf("This is the estimated world population after 4 years: %.2f%n%n", estimatedPopulationYear4);

		double e = estimatedPopulationYear4 * annualPopulationGrowthRate;
		double estimatedPopulationYear5 = estimatedPopulationYear4 + b;
		System.out.printf("This is the estimated world population after 5 years: %.2f%n%n", estimatedPopulationYear5);
	}
}