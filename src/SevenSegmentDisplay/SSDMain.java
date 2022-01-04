package SevenSegmentDisplay;

import java.util.Scanner;

public class SSDMain {

    public static void main(String[] args) {
        char[][]array = new char[5][4];
        SSDMethod usage = new SSDMethod();
        usage.setSevenSegment("10110111");
        usage.display();
    }
}
