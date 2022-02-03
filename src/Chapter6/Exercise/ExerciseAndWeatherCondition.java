package Chapter6.Exercise;

/*
6.28 Write a method sportsRecommender that inputs a Celsius temperature and returns “It’s
lovely weather for sports today!” if it’s 20–30 °C, “It’s reasonable weather for sports today.” if it’s
10–40 °C, and “Please exercise with care today, watch out for the weather!” otherwise. Create an
application to test the method.
 */


public class ExerciseAndWeatherCondition {


    public static String sportsRecommender(double celsius){
        String result = "";
        if(celsius >= 20 && celsius <= 30)
            result = "It's lovely weather for sports today!";
        else if(celsius >= 10 && celsius <= 40)
            result = "It's reasonable weather for sports today";
        else
            result = "Please exercise with care today, watch out for the weather!";
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sportsRecommender(20));
    }
}
