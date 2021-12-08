package Chapter7.Practice;


public class ArrayAssignmentMethod {

    public static int calculateMaximumLessOneNumber(int[] number){
        int max = Integer.MIN_VALUE;
        int total = 0;
        int lessOne = 0;

        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }

        for (int a = 0; a < number.length; a++){
            lessOne = total - number[a];
            if(max < lessOne)
                max = lessOne;
        }
        return max;
    }

    public static int calculateMinimumLessOneNumber(int[] number){
        int min = Integer.MAX_VALUE;
        int total = 0;
        int lessOne = 0;

        for (int b = 0; b < number.length; b++) {
            total += number[b];
        }

        for (int a = 0; a < number.length; a++){
            lessOne = total - number[a];
            if(min > lessOne)
                min = lessOne;
        }
        return min;
    }

}
