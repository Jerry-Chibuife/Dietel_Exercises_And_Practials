package Chapter3.Exercise;

public class HeartRatesApp {
    public static void main(String[] args) {
        HeartRates object1 = new HeartRates("John", "Doe", 1998, 04, 17);
        HeartRates object2 = new HeartRates("Otumba", "Linuus", 1983, 10, 29);

        System.out.println(object1.getLastName());

        System.out.println(object1.ageInYears(1998));

        System.out.println(object1.maximumHeartRate());

        System.out.printf("Your target heart rate is in a range of %.2f - %.2f", object1.minTargetHeartRate(), object1.maxTargetHeartRate());

        // System.out.println(object1.targetHeartRate());
    }
}
