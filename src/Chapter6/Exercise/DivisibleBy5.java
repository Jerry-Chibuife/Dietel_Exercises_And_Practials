package Chapter6.Exercise;

/*
6.17 (Divisible by 5)
Write a method isDivisible that uses the remainder operator (%)
to determine whether ten input integers are divisible by 5 or not.
The method should take an integer argument and return true if the integer is divisible by 5 and false otherwise.
Incorporate this method into an application that inputs a sequence of integers (one at a time)
and determines the result.
 */


public class DivisibleBy5 {


    public static boolean isDivisible(int number){
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 10, 34, 4, 45, 100, 125, 8, 40, 1205, 55};

        for (int number : numbers) {
            System.out.printf("%5d ", number);
            System.out.println(isDivisible(number));
        }
    }
}
