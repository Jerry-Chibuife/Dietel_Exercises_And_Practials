package Chapter6;

public class Cata {

    public char calculateGradeFor(int score) {
        if(score > 89) return 'A';
        if(score > 79) return 'B';
        if(score > 69) return 'C';
        if(score > 59) return 'D';
        if(score > 49) return 'E';
        if(score < 50) return 'F';
        return 0;
    }


    public String Price(int copy){
        if(copy >= 500) return "#1000 per copy";
        if(copy >= 200) return "#1100 per copy";
        if(copy >= 100) return "#1200 per copy";
        if(copy >= 50) return "#1300 per copy";
        if(copy >= 30) return "#1500 per copy";
        if(copy >= 10) return "#1600 per copy";
        if(copy >= 5) return "#1800 per copy";
        return "#2000 per copy";
    }
}
