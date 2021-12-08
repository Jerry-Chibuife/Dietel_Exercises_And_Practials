package Chapter7.Practice;

public class ArrayPractice4 {
    public static void main(String[] args) {
        char[][] ticTacToe = {{'X', 'O', 'O'}, {'X', 'X', 'X', 'X'}, {'O', 'X', 'O'}};

            for(int set = 0; set < ticTacToe.length; set++){
                for(int setter = 0; setter < ticTacToe[set].length; setter++) {
                    System.out.print(ticTacToe[set][setter] + " ");
                }
                System.out.println();
            }
    }
}
