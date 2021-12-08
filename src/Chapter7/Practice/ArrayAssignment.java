package Chapter7.Practice;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] number = new int[]{3, 2, 1, 4, 5};
        int result = ArrayAssignmentMethod.calculateMaximumLessOneNumber(number);
        int result2 = ArrayAssignmentMethod.calculateMinimumLessOneNumber(number);
        System.out.println("The maximum total after removing one value from array in succession is: "+ result);
        System.out.println("The minimum total after removing one value from array in succession is: "+ result2);
    }
}
