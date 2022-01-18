package Chapter4.Exercise;

public class CheckerboardPatternWithAsterisks {
    public static void main(String[] args) {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(j % 2 == 0) {
                    System.out.print("* ");
                }
                else System.out.print("* ");
            }
            System.out.println();
            if(i % 2 == 0)
                System.out.print(" ");
        }
    }
}
