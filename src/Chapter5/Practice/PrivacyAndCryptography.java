package Chapter5.Practice;

import java.util.Scanner;

public class PrivacyAndCryptography {
    public static void main(String[] args) {
        System.out.println("Enter your data as a four-digit figure: ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();

        int data1 = data / 1000;
        int data2 = (data % 1000) / 100;
        int data3 = (data % 100) / 10;
        int data4 = (data % 10);

        int encryptedData1 = (data1 + 7) % 10;
        int encryptedData2 = (data2 + 7) % 10;
        int encryptedData3 = (data3 + 7) % 10;
        int encryptedData4 = (data4 + 7) % 10;

        System.out.print("Your data has been encrypted as: ");
        System.out.printf("%d%d%d%d", encryptedData3, encryptedData4, encryptedData1, encryptedData2);
    }
}
