package Chapter5.Exercise;

/*
5.24 (Diamond-Printing Program) Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk (*), a single space or a single newline character.
Maximize your use of iteration (with nested for statements), and minimize the number of output statements.
 */


public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int count = 1;
            for(int j = 1; j <= 9; j += 2) {
                for(int k = count; k <= 4; k++){
                    System.out.print(" ");
                }
                count++;
                for(int l = 1; l <= j; l++){
                    System.out.print("*");
                }
                System.out.println();
            }
        int counter = 4;
            for(int p = 1; p <= 7; p += 2){
                for(int t = counter; t <= 4; t++) {
                    System.out.print(" ");
                }
                counter--;
                for (int b = 7; b >= p; b--){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
