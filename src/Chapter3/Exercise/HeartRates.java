package Chapter3.Exercise;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public HeartRates(String givenName, String surname, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        firstName = givenName;
        lastName = surname;
        birthYear = yearOfBirth;
        birthMonth = monthOfBirth;
        birthDay = dayOfBirth;
    }

    public void setFirstName(String personalName){
        firstName = personalName;
    }
    public void setLastName(String familyName){
        lastName = familyName;
    }
    public void setBirthYear(int yearDemBornYou){
        birthYear = yearDemBornYou;
    }
    public void setBirthMonth(int monthDemBornYou){
        birthMonth = monthDemBornYou;
    }
    public void setBirthDay(int dayDemBornYou){
        birthDay = dayDemBornYou;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
    public int getBirthDay(){
        return birthDay;
    }


    public int ageInYears(int age) {
        age = 2021 - birthYear;
        return age;
    }
    public int maximumHeartRate(){
        int max = 220 - ageInYears(2021 - birthYear);
        return max;
    }
    public double minTargetHeartRate(){
        double percent1 = 0.50;
        double minTargetHeartRate = percent1 * maximumHeartRate();
        return minTargetHeartRate;
    }
    public double maxTargetHeartRate(){
        double percent1 = 0.85;
        double maxTargetHeartRate = percent1 * maximumHeartRate();
        return maxTargetHeartRate;
    }
}
