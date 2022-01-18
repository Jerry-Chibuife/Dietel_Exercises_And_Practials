package Chapter5.Exercise;


/*
5.22 (Modified Triangle-Printing Program) Modify Exercise 5.15 to combine your code from
the four separate triangles of asterisks such that all four patterns print side by side.
[Hint: Make clever use of nested for loops.]
 */


public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        char symbol = '*';
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(symbol);
            }
            for(int b = 10; b >= i; b--) {
                for(int e = 1; e <= 11-i; e++){
                    if(b == 10)
                        System.out.print(" ");
                }
                System.out.print(symbol);
            }
            for(int k = 1; k <= i; k ++)
                System.out.print(" ");
            for(int g = 10; g <= i; g ++){
                System.out.print(" ");
            }
            for(int q = i; q <= 10; q++)
                System.out.print(symbol);
            System.out.println();
        }


//        System.out.println();
//
//        for(int a = 1; a <= 10; a++){
//            for(int b = 10; b >= a; b--){
//                System.out.print(symbol);
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for(int p = 1; p <= 10; p++){
//            for(int q = 2; q <= p; q++) {
//                System.out.print(" ");
//            }
//            for(int r = p; r <= 10; r++){
//                System.out.print(symbol);
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for(int x = 1; x <= 10; x++){
//            for(int y = x; y < 10; y++){
//                System.out.print(" ");
//            }
//            for (int z = 1; z <= x; z++){
//                System.out.print(symbol);
//            }
//            System.out.println();
//        }
    }
}
