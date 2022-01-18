package Chapter5.Exercise;


/*
5.20 (Calculating the Value of π) Calculate the value of π from the infinite series

pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ....

Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?
 */


public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        int pi;
        for(int i = 1; i <= 200000; i++){
            for (int c = 1; c <= 200000; c++)
                for(int a = 1; a <= 1; a++)
                    if(c % 2 == 1) {
                        pi = 4 + (i - 1) * (-8 / ((c + 2) + 2));
                        System.out.println("Term " + i + " Value: " + pi);
                    }
        }
    }
}
