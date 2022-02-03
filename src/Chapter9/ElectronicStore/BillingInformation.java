package Chapter9.ElectronicStore;

public class BillingInformation {
//    private int phoneNumber;
//    private String name;
//    private Address deliveryAddress;

    private CreditCard creditCard;
    private Customers customers;
    private Receiver receiver;


    public BillingInformation(Customers customers, CreditCard creditCard){
        this.customers = customers;
        this.creditCard = creditCard;
    }

    public BillingInformation(Receiver receiver, CreditCard creditCard){
        this.receiver = receiver;
        this.creditCard = creditCard;
    }
}
