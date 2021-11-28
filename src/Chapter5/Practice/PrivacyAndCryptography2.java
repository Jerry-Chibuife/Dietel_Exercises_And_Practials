package Chapter5.Practice;

import java.util.Scanner;

public class PrivacyAndCryptography2 {
    public static void main(String[] args) {
        System.out.println("Enter four-digit encrypted data: ");
        Scanner input = new Scanner(System.in);
        int encryptedData = input.nextInt();

        int firstValue = encryptedData / 1000;
        int secondValue = (encryptedData % 1000) / 100;
        int thirdValue = (encryptedData % 100) / 10;
        int fourthValue = (encryptedData % 10);

        double initialDecryptedValue1 = ((1.0 + ((double) firstValue / 10)) * 10);
        double initialDecryptedValue2 = ((1.0 + ((double) secondValue / 10)) * 10);
        double initialDecryptedValue3 = ((1.0 + ((double) thirdValue / 10)) * 10);
        double initialDecryptedValue4 = ((1.0 + ((double) fourthValue / 10)) * 10);

        double finalDecryptedValue1 = (initialDecryptedValue1 - 7) % 10;
        double finalDecryptedValue2 = (initialDecryptedValue2 - 7) % 10;
        double finalDecryptedValue3 = (initialDecryptedValue3 - 7) % 10;
        double finalDecryptedValue4 = (initialDecryptedValue4 - 7) % 10;

        int originalData1 = (int) Math.round(finalDecryptedValue1);
        int originalData2 = (int) Math.round(finalDecryptedValue2);
        int originalData3 = (int) Math.round(finalDecryptedValue3);
        int originalData4 = (int) Math.round(finalDecryptedValue4);

        System.out.print("Your data has been decrypted. This is the original data: ");
        System.out.printf("%d%d%d%d", originalData3, originalData4, originalData1, originalData2);
    }
}
