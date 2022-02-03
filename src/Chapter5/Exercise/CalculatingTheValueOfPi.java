package Chapter5.Exercise;


/*
5.20 (Calculating the Value of π) Calculate the value of π from the infinite series

pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ....

Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?
 */


public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        double pi = 0;
        int numerator = 4;
        double denominator = 1;

        for(int i = 1; i <= 200001; i++){
            if(i % 2 == 0){
                pi -= (numerator / denominator);}
            else{
                pi += (numerator / denominator);}
            denominator += 2;
            System.out.printf("%d/%.1f: ", numerator, denominator);
            System.out.printf("%.10f%n", pi);
        }
        System.out.println("Final value of pi is " + pi);

    }
}
