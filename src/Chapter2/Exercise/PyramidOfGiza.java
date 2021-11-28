package Chapter2.Exercise;

public class PyramidOfGiza{

	public static void main(String[] args){

		int estimatedNumberOfStones = 2300000;
		double averageWeightOfStones = 2.5;
		int numberOfYears = 20;
		double totalWeightOfPyramid = estimatedNumberOfStones * averageWeightOfStones;

		int yearsInSecond = 630720000;
		double weightBuiltInOneSecond = totalWeightOfPyramid / yearsInSecond;
		double weightBuiltInOneMinute = (60 * totalWeightOfPyramid) / yearsInSecond;
		System.out.printf("The estimated weight of pyramid built in a minute is: %.2f tonnes %n", weightBuiltInOneMinute);
		double weightBuiltInOneHour = (3600 * totalWeightOfPyramid) / yearsInSecond;
		System.out.printf("The estimated weight of pyramid built in an hour is: %.2f tonnes %n", weightBuiltInOneHour);
		double weightBuiltInOneYear = (31536000 * totalWeightOfPyramid) / yearsInSecond;
		System.out.printf("The estimated weight of pyramid built in a year is: %.2f tonnes %n", weightBuiltInOneYear);
	}
}