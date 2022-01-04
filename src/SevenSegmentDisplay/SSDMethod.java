package SevenSegmentDisplay;

import java.util.Arrays;

public class SSDMethod {

    private static int[][] segments= {{0,0,0,0},{0,0,0,0},{0,0,0,0}, {0,0,0,0},{0,0,0,0}};


    public void setSevenSegment(String value) {
        validateInput(value);
    }

    private void validateInput(String value) {
        boolean isValid= isValid(value);
        if (isValid && value.charAt(value.length()-1) == '1'){
            checkIndividualCharacterToDisplay(value);
        }else{
            for (int[] segment : segments) {
                Arrays.fill(segment, 0);
            };
            display();
        }
    }

    private void checkIndividualCharacterToDisplay(String value) {

        if (Character.getNumericValue(value.charAt(0)) == 1){
            sideA();
        }
        if (Character.getNumericValue(value.charAt(1)) == 1){
            sideB();
        }
        if (Character.getNumericValue(value.charAt(2)) == 1){
            sideC();
        }
        if (Character.getNumericValue(value.charAt(3)) == 1){
            sideD();
        }
        if (Character.getNumericValue(value.charAt(4)) == 1){
            sideE();
        }
        if (Character.getNumericValue(value.charAt(5)) == 1){
            sideF();
        }
        if (Character.getNumericValue(value.charAt(6)) == 1){
            sideG();
        }
    }

    private boolean isValid(String value) {
        if (value.length() == 8) return true;
        else{
            System.out.println("not valid");
            return false;
        }
    }


    public void display() {
        for (int i = 0; i < segments.length; i++) {
            for (int j = 0; j < segments[i].length; j++) {
                if (segments[i][j] == 1) System.out.print('#');
                else System.out.print(' ');
//                System.out.print(segments[i][j]);
            }
            System.out.println();
        }
    }


    public void sideA(){
        segments[0][0]=1;
        segments[0][1]=1;
        segments[0][2]=1;
        segments[0][3]=1;
    }
    public void sideB(){
        segments[0][3]=1;
        segments[1][3]=1;
        segments[2][3]=1;
    }
    public void sideC(){
        segments[2][3]=1;
        segments[3][3]=1;
        segments[4][3]=1;
    }
    public void sideD(){
        segments[4][0]=1;
        segments[4][1]=1;
        segments[4][2]=1;
        segments[4][3]=1;
    }
    public void sideE(){
        segments[2][0]=1;
        segments[3][0]=1;
        segments[4][0]=1;
    }
    public void sideF(){
        segments[0][0]=1;
        segments[1][0]=1;
        segments[2][0]=1;
    }
    public void sideG(){
        segments[2][0]=1;
        segments[2][1]=1;
        segments[2][2]=1;
        segments[2][3]=1;
    }
}
