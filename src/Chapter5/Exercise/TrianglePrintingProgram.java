package Chapter5.Exercise;

/*
5.15 (Triangle Printing Program) Write an application that displays the following patterns separately, one below the other.
Use for loops to generate the patterns.
All asterisks (*) should be printed by a single statement of the form System.out.print('*'); which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' '); can be used to display a space for the last two patterns.
There should be no other output statements in the program.
[Hint: The last two patterns require that each line begin with an appropriate number of blank spaces.]
 */


public class TrianglePrintingProgram {
    public static void main(String[] args) {
        char symbol = '*';
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();

        for(int a = 1; a <= 10; a++){
            for(int b = 10; b >= a; b--){
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();

        for(int p = 1; p <= 10; p++){
            for(int q = 2; q <= p; q++) {
                System.out.print(" ");
            }
            for(int r = p; r <= 10; r++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();

        for(int x = 1; x <= 10; x++){
            for(int y = x; y < 10; y++){
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
