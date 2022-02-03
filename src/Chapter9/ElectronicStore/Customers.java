package Chapter9.ElectronicStore;

import java.util.ArrayList;

public class Customers extends Users{
    private ShoppingCart shoppingCart;
    private Address deliveryAddress;
    private CreditCard information;
    private ArrayList<BillingInformation> billingInformation = new ArrayList<>();

    public Customers(String name, int age, Address address, String mail, int phoneNo, String passcode){
        super(name, age, address, mail, phoneNo, passcode);
        deliveryAddress = address;
    }
}
