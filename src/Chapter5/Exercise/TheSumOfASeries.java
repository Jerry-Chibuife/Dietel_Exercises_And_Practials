package Chapter5.Exercise;

/*
5.13 (The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?
 */


public class TheSumOfASeries {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <= 100; i++){
            total += i;
            System.out.printf("%d\t\t\t%d%n", i, total);
        }
    }
}
