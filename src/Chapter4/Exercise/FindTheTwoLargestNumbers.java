package Chapter4.Exercise;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            int number = input.nextInt();
            if(number > largest) {
                secondLargest = largest;
                largest = number;
            }
        }
        System.out.println("The largest is " + largest + " and the second largest is " + secondLargest);
    }
}
