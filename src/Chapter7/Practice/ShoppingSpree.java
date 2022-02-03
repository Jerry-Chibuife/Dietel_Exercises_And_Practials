package Chapter7.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingSpree {
    static ArrayList<String> products = new ArrayList<>();
    static ArrayList<Integer> quantities = new ArrayList<>();
    static ArrayList<Double> prices = new ArrayList<>();
    static ArrayList<Double> total = new ArrayList<>();

    public static String displayInvoice(){
        String address = "Lolo Mall\n" +
                "34, Apapa Road,\n" +
                "Lagos.\n" +
                "09012345432\n";
        String item = "Item";
        String quantity = "Quantity";
        String price = "Price";
        String total = "Total Price";
        return String.format("%s%15s%15s%15s%15s", address, item, quantity, price, total);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("How can I help you today?");
        String firstResponse = input.next();
        input.nextLine();

        salesClerk(input);

        System.out.println("Anymore items? Yes or No");
        String response = input.next();

        while(response.equalsIgnoreCase("Yes")){
            salesClerk(input);
            System.out.println("Anymore items? Yes or No");
            response = input.next();

        }

        System.out.println(displayInvoice());

        for(int i = 0; i < products.size(); i++){
            System.out.printf("%s%14d%15.0f%15.0f", products.get(i), quantities.get(i), prices.get(i), total.get(i));
            System.out.println();
        }
    }

    private static void salesClerk(Scanner input) {

        System.out.println("What did the customer buy?");
        String product = input.next();
        products.add(product);

        input.nextLine();

        System.out.println("How many of " + product + " did the customer get?");
        int quantity = input.nextInt();
        quantities.add(quantity);

        System.out.println("What is the unit price of " + product + "?");
        double price = input.nextDouble();
        prices.add(price);

        total.add(quantity * price);

    }
}
