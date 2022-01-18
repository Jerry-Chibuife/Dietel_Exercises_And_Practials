package Chapter4.Exercise;

import java.util.Scanner;

public class DanglingElseProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > 5){
            if (y > 5)
                System.out.println("x and y are > 5");
        }else System.out.println("x is <= 5");

    }
}
