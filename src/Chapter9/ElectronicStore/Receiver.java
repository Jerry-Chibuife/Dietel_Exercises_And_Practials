package Chapter9.ElectronicStore;

public class Receiver {
    private Customers customer;
    private String name;
    private Address deliveryAddress;
    private int phoneNumber;

    public Receiver(Customers customers){
        this.customer = customers;
    }

    public Receiver(String receiverName, Address address, int phoneNo){
        name = receiverName;
        deliveryAddress = address;
        phoneNumber = phoneNo;
    }
}
