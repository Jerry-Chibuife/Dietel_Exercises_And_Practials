package Chapter5.Exercise;

/*
5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.
 */


public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        double principal = 1000.0;
        double amount;
        //System.out.println("Year\t\t\tAmount on deposit");
        for(int year = 1; year <= 10; year++){
            System.out.print("Year " + year + "\t\t");
            for(double rate = 5; rate <= 10; rate++){
                amount = principal * Math.pow(1.0 + (rate / 100), year);
                System.out.printf("For %.1f%% rate, the amount at the end of the year is %.2f%n", rate, amount);
                System.out.print("\t\t\t");
            }
            System.out.println();
        }
    }
}
