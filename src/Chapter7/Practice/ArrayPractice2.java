package Chapter7.Practice;

/*
Take ten scores.
Ask user to enter score at each time.
After entering ten scores, print average, minimum, maximum, total.
Also print the scores entered.
Note: Use an array.
*/


import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int[] numberList = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        int average = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            System.out.print("Enter a new score: ");
            scores[i] = input.nextInt();
            numberList[i] = scores[i];
            total = total + scores[i];
            if(min > scores[i]){
                min = scores[i];
            }
            if(max < scores[i]){
                max = scores[i];
            }
        }

        System.out.print(numberList[0]+ " ");  System.out.print(numberList[1]+ " ");
        System.out.print(numberList[2]+ " ");  System.out.print(numberList[3]+ " ");
        System.out.print(numberList[4]+ " ");  System.out.print(numberList[5]+ " ");
        System.out.print(numberList[6]+ " ");  System.out.print(numberList[7]+ " ");
        System.out.print(numberList[8]+ " ");  System.out.print(numberList[9]);

        System.out.println();

        average = total/10;
        System.out.println("The total score is: "+ total);
        System.out.println("The average score is: "+ average);
        System.out.println("The minimum number is: "+ min);
        System.out.println("The maximum number is: "+ max);

    }
}
