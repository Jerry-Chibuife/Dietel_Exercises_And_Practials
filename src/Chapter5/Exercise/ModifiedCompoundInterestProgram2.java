package Chapter5.Exercise;


/*
5.18 (Modified Compound-Interest Program) Modify the application in Fig. 5.6 to use only integers to calculate the compound interest.
[Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents portions by using the division and remainder operations, respectively.
Insert a period between the dollars and the cents portions.]
 */


public class ModifiedCompoundInterestProgram2 {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = 0.05;

        for(int year = 1; year <= 10; year++){
            double amount = principal * Math.pow(1 + rate, year);
            System.out.printf("Year %d\tAmount On Depost: $%d.%d", year, (int)amount / 100, (int)amount % 100);
            System.out.println();
        }
    }
}
