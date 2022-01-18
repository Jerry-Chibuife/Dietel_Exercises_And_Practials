package Chapter4.Exercise;

public class TabularOutput {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", i, i*i, i*i*i, i*i*i*i);
        }
    }
}
