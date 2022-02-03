package Chapter9.ElectronicStore;

public class Address {
    private String cityName;
    private String countryName;
    private int houseNumber;
    private String streetName;
    private String state;

    public Address(int houseNumber, String streetName, String cityName,
                   String state, String countryName){
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.state = state;
        this.countryName = countryName;
    }
}
