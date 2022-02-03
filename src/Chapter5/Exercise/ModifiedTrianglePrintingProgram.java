package Chapter5.Exercise;


/*
5.22 (Modified Triangle-Printing Program) Modify Exercise 5.15 to combine your code from
the four separate triangles of asterisks such that all four patterns print side by side.
[Hint: Make clever use of nested for loops.]
 */


public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        int count = 1;
            for (int i = 1; i <= 10; i++) {
                for(int c = 1; c <= i; c++)
                    System.out.print("*");
                for(int q = 10; q >= i; q--)
                    System.out.print(" ");
                for(int j = i; j <= 10; j++)
                    System.out.print("*");
                for(int a = count; a >= i; a--) {
                    System.out.print(" ");
                }
                count += 3;
                for(int b = 10; b >= i; b--)
                    System.out.print("*");
                for(int y = 10; y >= i; y--)
                    System.out.print(" ");
                for(int k = 1; k <=i; k++)
                    System.out.print("*");

                System.out.println();
            }
    }
}
