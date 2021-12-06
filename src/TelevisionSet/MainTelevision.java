package TelevisionSet;

import javax.swing.*;
import java.util.Scanner;

public class MainTelevision {
    public static void main(String[] args) {
        Television toshiba = new Television("LG High-Definition");

        String dropDown = ("""
                LG. Life's Good.\s
                We offer the best experience.\s
                Press 1 to switch on television. Press 2 to switch it off.
                """);
        System.out.println(dropDown);

        Scanner input = new Scanner(System.in);
        int button = input.nextInt();
        switch (button){
            case 1:
                toshiba.turnItOn();
                String dialog = ("""
                        Have a nice cinematic experience!
                        """);
                System.out.println(dialog);
                String newDialog = ("""
                        Would you like to make some personal changes?
                        
                        Press 1 to adjust volume     Press 2 to adjust brightness
                        
                        Press 3 to adjust contrast   Press 4 to adjust sharpness
                        
                        Press 5 to adjust colour     Press 6 to switch Video Quality
                        
                        Press 7 to switch Audio Quality
                        """);
                System.out.println(newDialog);
                int click = input.nextInt();
                switch (click){
                    case 1:
                        String newDialog2 = ("""
                                Press 1 to increase volume
                                Press 2 to decrease volume
                                """);
                        System.out.println(newDialog2);
                        int clicker = input.nextInt();
                        switch (clicker){
                            case 1:
                                while(toshiba.getVolume() < 100) {
                                    toshiba.increaseVolume();
                                }
                                    break;
                            case 2:
                                while(toshiba.getVolume() > 0) {
                                    toshiba.decreaseVolume();
                                }
                                break;
                        }
                }
            break;
        }
    }
}
